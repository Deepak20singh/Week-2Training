package hierarchicalinheritance.schoolsystemwithdifferentroles;

public class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println(name + " is a Staff member in the " + department + " department.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role :- Staff");
        System.out.println("Department :- " + department);
    }
}