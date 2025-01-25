package hierarchicalinheritance.schoolsystemwithdifferentroles;

public class SchoolSystemMain {
    public static void main(String[] args) {
        // Create a Teacher
        Teacher teacher = new Teacher("Aryan", 35, "Mathematics");
        System.out.println("Teacher Details");
        teacher.displayDetails();
        teacher.displayRole();
        System.out.println();

        // Create a Student
        Student student = new Student("Dev", 16, "10th Grade");
        System.out.println("Student Details");
        student.displayDetails();
        student.displayRole();
        System.out.println();

        // Create a Staff
        Staff staff = new Staff("Aditya", 40, "Administration");
        System.out.println("Staff Details");
        staff.displayDetails();
        staff.displayRole();
    }
}
