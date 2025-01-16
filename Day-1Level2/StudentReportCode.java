import java.util.Scanner;

class Student {
    String name;
    int rollNumber, marks = 0;
    int subject;
    String grade;

    // Constructor to initialize name and number of subjects
    Student(String name, int subject) {
        this.name = name;
        this.subject = subject;
    }

    // Method to accumulate marks for each subject
    void sum(int mark) {
        marks = marks + mark;
    }

    // Method for grade 
    void grades() {
        
        double average = (double) marks / subject; // Cast to double for accurate average calculation

        if (average > 90) {
            grade = "A";
        } else if (average > 80) {
            grade = "B";
        } else if (average > 70) {
            grade = "C";
        } else if (average > 60) {
            grade = "D";
        } else {
            grade = "E";
        }
    }

    // display student details
    void display() {
        // Calculating average 
        double average = (double) marks / subject;
        System.out.println("The name of student is " + name + ". The Average marks of student is " + average + " and grade of student is " + grade);
    }
}

class StudentReportCode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Get the name of the student
        System.out.print("Enter the name of student: ");
        String name = sc.nextLine();

        System.out.print("Enter the number of subjects: ");
        int sub = sc.nextInt();

       
        Student student = new Student(name, sub);

        for (int i = 0; i < sub; i++) {
            System.out.print("Enter the marks for subject " + (i + 1) + ": ");
            int k = sc.nextInt();
            student.sum(k); // Adding marks t
        }

        // Calculating the grade 
        student.grades();

        // Display details
        student.display();

        sc.close();
    }
}
