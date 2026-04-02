import java.util.ArrayList;

public class EmployeeReportGenerator {

    public static void generateReport(ArrayList<Employee> employees) {
        if (employees.isEmpty()) {
            System.out.println("No data available!");
            return;
        }

        double total = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        Employee highest = null;
        Employee lowest = null;

        for (Employee e : employees) {
            total += e.getSalary();

            if (e.getSalary() > max) {
                max = e.getSalary();
                highest = e;
            }

            if (e.getSalary() < min) {
                min = e.getSalary();
                lowest = e;
            }
        }

        System.out.println("\n=== REPORT ===");
        System.out.println("Total Employees: " + employees.size());
        System.out.println("Total Salary: " + total);
        System.out.println("Average Salary: " + (total / employees.size()));
        System.out.println("Highest Salary: " + highest.getName());
        System.out.println("Lowest Salary: " + lowest.getName());
    }
}