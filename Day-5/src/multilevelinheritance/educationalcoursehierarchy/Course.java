package multilevelinheritance.educationalcoursehierarchy;

public class Course {
    private String courseName;
    private int duration; // Duration in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Course Name :- " + courseName);
        System.out.println("Duration :- " + duration + " hours");
    }

}
