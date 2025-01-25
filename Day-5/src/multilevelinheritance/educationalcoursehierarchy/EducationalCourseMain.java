package multilevelinheritance.educationalcoursehierarchy;

public class EducationalCourseMain { public static void main(String[] args) {
    // Base Course
    Course course = new Course("Basic Java Programming", 20);
    System.out.println(" Course Details ");
    course.displayDetails();
    System.out.println();

    // Online Course
    OnlineCourse onlineCourse = new OnlineCourse("Java Programming", 40, "Udemy", true);
    System.out.println(" Online Course Details ");
    onlineCourse.displayDetails();
    System.out.println();

    // Paid Online Course
    PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse(
            "Web Development", 60, "Coursera", false, 499.99, 20
    );
    System.out.println("Paid Course Details ");
    paidOnlineCourse.displayDetails();
}
}