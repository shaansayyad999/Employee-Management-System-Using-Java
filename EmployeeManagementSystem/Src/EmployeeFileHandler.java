import java.io.*;
import java.util.ArrayList;

public class EmployeeFileHandler {

    private static final String FILE_NAME = "data/employees.dat";

    public static void saveToFile(ArrayList<Employee> employees) {
        try {
            File dir = new File("data");
            if (!dir.exists()) dir.mkdir();

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            oos.writeObject(employees);
            oos.close();

            System.out.println("Data saved successfully!");
        } catch (Exception e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    public static ArrayList<Employee> loadFromFile() {
        ArrayList<Employee> list = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
            list = (ArrayList<Employee>) ois.readObject();
            ois.close();

            System.out.println("Data loaded successfully!");
        } catch (Exception e) {
            System.out.println("No previous data found.");
        }
        return list;
    }
}