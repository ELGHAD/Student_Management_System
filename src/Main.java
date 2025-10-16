import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== 🎓 Student Management System =====");
            System.out.println("1️⃣ Add Student");
            System.out.println("2️⃣ View All Students");
            System.out.println("3️⃣ Update Student");
            System.out.println("4️⃣ Delete Student");
            System.out.println("5️⃣ Searching for a Student");
            System.out.println("6\uFE0F⃣ Exit");
            System.out.print("👉 Enter choice: ");

            int choice = readInt(sc, "⚠️ Invalid choice. Please enter a number: ");

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = readInt(sc, "⚠️ Invalid ID. Please enter a number: ");
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Grade: ");
                    double grade = readDouble(sc, "⚠️ Invalid grade. Please enter a number: ");
                    service.addStudent(new Student(id, name, grade));
                }
                case 2 -> service.viewAll();
                case 3 -> {
                    System.out.print("Enter ID of Student to update: ");
                    int id = readInt(sc, "⚠️ Invalid ID. Please enter a number: ");
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String name = sc.nextLine();
                    double grade = readDouble(sc, "⚠️ Invalid grade. Please enter a number: ");
                    service.updateStudent(id, name, grade);
                }
                case 4 -> {
                    System.out.print("enter Id of student to delete : ");
                    int id = readInt(sc, "⚠️ Invalid ID. Please enter a number: ");
                    service.deleteStudent(id);
                }
                case 5 -> {
                    System.out.print("Enter ID or Name to search: ");
                    sc.nextLine();
                    String key = sc.nextLine();
                    service.searchStudent(key);
                }

                case 6 -> {
                    System.out.println("👋 Exiting system...");
                    return;
                }


                default -> System.out.println("⚠️ Invalid choice!");
            }
        }
    }

    // ✅ Helper method to safely read integer input
    private static int readInt(Scanner sc, String errorMessage) {
        while (!sc.hasNextInt()) {
            System.out.print(errorMessage);
            sc.next(); // clear invalid input
        }
        return sc.nextInt();
    }

    // ✅ Helper method to safely read double input
    private static double readDouble(Scanner sc, String errorMessage) {
        while (!sc.hasNextDouble()) {
            System.out.print(errorMessage);
            sc.next(); // clear invalid input
        }
        return sc.nextDouble();
    }
}
