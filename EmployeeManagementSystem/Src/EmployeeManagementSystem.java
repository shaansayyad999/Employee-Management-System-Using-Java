import java.util.*;

public class EmployeeManagementSystem {

    static ArrayList<Employee> employees = new ArrayList<>();
    static HashMap<String, Employee> employeeMap = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        employees = EmployeeFileHandler.loadFromFile();
        for (Employee e : employees) {
            employeeMap.put(e.getId(), e);
        }

        while (true) {
            System.out.println("\n=== EMPLOYEE MANAGEMENT SYSTEM ===");
            System.out.println("1. Add New Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Generate Reports");
            System.out.println("7. Save to File");
            System.out.println("8. Load from File");
            System.out.println("9. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    searchEmployee();
                    break;
                case 4:
                    updateEmployee();
                    break;
                case 5:
                    deleteEmployee();
                    break;
                case 6:
                    EmployeeReportGenerator.generateReport(employees);
                    break;
                case 7:
                    EmployeeFileHandler.saveToFile(employees);
                    break;
                case 8:
                    employees = EmployeeFileHandler.loadFromFile();
                    employeeMap.clear();
                    for (Employee e : employees) {
                        employeeMap.put(e.getId(), e);
                    }
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void addEmployee() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        if (employeeMap.containsKey(id)) {
            System.out.println("Employee already exists!");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Position: ");
        String pos = sc.nextLine();

        double salary = 0;
        try {
            System.out.print("Enter Salary: ");
            salary = Double.parseDouble(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Invalid salary!");
            return;
        }

        Employee emp = new Employee(id, name, dept, pos, salary);
        employees.add(emp);
        employeeMap.put(id, emp);

        System.out.println("Employee added!");
    }

    static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found!");
            return;
        }

        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    static void searchEmployee() {
        System.out.println("1. By ID");
        System.out.println("2. By Name");
        System.out.println("3. By Department");

        int ch = sc.nextInt();
        sc.nextLine();

        if (ch == 1) {
            System.out.print("Enter ID: ");
            String id = sc.nextLine();
            System.out.println(employeeMap.getOrDefault(id, null));
        } else if (ch == 2) {
            System.out.print("Enter Name: ");
            String name = sc.nextLine().toLowerCase();
            for (Employee e : employees) {
                if (e.getName().toLowerCase().contains(name))
                    System.out.println(e);
            }
        } else if (ch == 3) {
            System.out.print("Enter Department: ");
            String dept = sc.nextLine().toLowerCase();
            for (Employee e : employees) {
                if (e.getDepartment().toLowerCase().contains(dept))
                    System.out.println(e);
            }
        }
    }

    static void updateEmployee() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        Employee e = employeeMap.get(id);
        if (e == null) {
            System.out.println("Not found!");
            return;
        }

        System.out.print("New Name: ");
        e.setName(sc.nextLine());

        System.out.print("New Department: ");
        e.setDepartment(sc.nextLine());

        System.out.print("New Position: ");
        e.setPosition(sc.nextLine());

        System.out.print("New Salary: ");
        e.setSalary(Double.parseDouble(sc.nextLine()));

        System.out.println("Updated successfully!");
    }

    static void deleteEmployee() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        Employee e = employeeMap.remove(id);
        if (e != null) {
            employees.remove(e);
            System.out.println("Deleted successfully!");
        } else {
            System.out.println("Not found!");
        }
    }
}