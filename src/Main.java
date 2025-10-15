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
            System.out.println("5️⃣ Exit");
            System.out.print("👉 Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: "); int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: "); String name = sc.nextLine();
                    System.out.print("Enter Grade: "); double grade = sc.nextDouble();
                    service.addStudent(new Student(id, name, grade));
                }
                case 2 -> service.viewAll();
                case 3 -> {
                    System.out.print("Enter ID: "); int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: "); String name = sc.nextLine();
                    System.out.print("Enter New Grade: "); double grade = sc.nextDouble();
                    service.updateStudent(id, name, grade);
                }
                case 4 -> {
                    System.out.print("Enter ID to delete: "); int id = sc.nextInt();
                    service.deleteStudent(id);
                }
                case 5 -> {
                    System.out.println("👋 Exiting system...");
                    return;
                }
                default -> System.out.println("⚠️ Invalid choice!");
            }
        }
    }
}
