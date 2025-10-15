public class Student {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getGrade() { return grade; }

    public void setName(String name) { this.name = name; }
    public void setGrade(double grade) { this.grade = grade; }

    @Override
    public String toString() {
        return id + " | " + name + " | Grade: " + grade;
    }
}
