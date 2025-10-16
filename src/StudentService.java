import java.io.*;
import java.util.*;

public class StudentService {
    private final List<Student> students = new ArrayList<>();
    private final String filePath = "students.txt";

    public StudentService() {
        loadFromFile();
    }

    public void addStudent(Student s) {
        if (existsId(s.getId())) {
            System.out.println("❌ A student with ID " + s.getId() + " already exists. Choose a different ID.");
            return;
        }
        students.add(s);
        saveToFile();
        System.out.println("✅ Student added successfully!");
    }
    public boolean existsId(int id) {
        return students.stream().anyMatch(s -> s.getId() == id);
    }


    public void viewAll() {
        if (students.isEmpty()) System.out.println("No students found!");
        else students.forEach(System.out::println);
    }

    public void updateStudent(int id, String newName, double newGrade) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(newName);
                s.setGrade(newGrade);
                saveToFile();
                System.out.println("✅ Student updated successfully!");
                return;
            }
        }
        System.out.println("❌ Student not found!");
    }

    public void deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);
        saveToFile();
        System.out.println("🗑️ Student deleted!");
    }
    public void searchStudent(String keyword) {
        boolean found = false;
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(keyword) || String.valueOf(s.getId()).equals(keyword)) {
                System.out.println(s);
                found = true;
            }
        }
        if (!found) System.out.println("❌ No student found with that name or ID.");
    }

    private void saveToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (Student s : students)
                writer.println(s.getId() + "," + s.getName() + "," + s.getGrade());
        } catch (IOException e) {
            System.out.println("⚠️ Error saving to file.");
        }
    }

    private void loadFromFile() {
        File file = new File(filePath);
        if (!file.exists()) return;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                students.add(new Student(
                        Integer.parseInt(data[0]),
                        data[1],
                        Double.parseDouble(data[2])
                ));
            }
        } catch (Exception e) {
            System.out.println("⚠️ Error loading from file.");
        }
    }
}
