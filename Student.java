public class Student {
    private String name;

    // Constructor with no parameters
    public Student() {
        this.name = "Unknown";
    }

    // Constructor with one parameter
    public Student(String name) {
        this.name = name;
    }

    // Method to display the name of the student
    public void displayName() {
        System.out.println("Student Name: " + this.name);
    }

    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student();
        Student student2 = new Student("Alice");

        // Displaying student names
        student1.displayName();  // Output: Student Name: Unknown
        student2.displayName();  // Output: Student Name: Alice
    }
}
