package hierarchicalinheritance.schoolsystemwithdifferentroles;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println(name + " is a Teacher. They teach " + subject + ".");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role :- Teacher");
        System.out.println("Subject :- " + subject);
    }
}