package hierarchicalinheritance.schoolsystemwithdifferentroles;

public class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println(name + " is a Student in grade " + grade + ".");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role :- Student");
        System.out.println("Grade :- " + grade);
    }
}