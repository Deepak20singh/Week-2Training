import java.util.*;

class School{
	private String schoolName;
	private ArrayList<Student> student;
	
	public School(String schoolName){
		this.schoolName=schoolName;
		this.student=new ArrayList<>();
	}
	
	public void addStudent(Student students){
		student.add(students);
		
	}
		
		public void showDetail(){
			System.out.println("Name of School :- "+schoolName);
			for(Student stud:student){
				System.out.println("Name of the Student :- "+stud.studentName);
				System.out.println("student enrolled ");
				stud.showDetailCourse();
				
			}
		}
		
		
}
class Student{
	public String studentName;
	private ArrayList<Course> course;
	
	public Student(String studentName){
		this.studentName=studentName;
		this.course=new ArrayList<>();
	}
	public void addCourses(Course cou,Student obj){
		course.add(cou);
		cou.enrolled(obj);
	}
	public void showDetailCourse(){
			for(Course cou:course){
				System.out.println("Name of the courses :- "+cou.courseName);
				
				
			}
		}
	
	
}
class Course{
	public String courseName;
	private ArrayList<Student> enrolledStudent;
	public Course(String courseName){
		this.courseName=courseName;
		this.enrolledStudent=new ArrayList<>();
	}
	
	public void enrolled(Student std)
	{
		enrolledStudent.add(std);
	}
		
}
	public class StudentCode{
		public static void main(String args[]){
			School school1=new School("Laptop school");
			School school2=new School("Dev Institute");
			School school3=new School("Adiya Institute");
			
		    Student stud1=new Student("Dev");//association ke liye
            Student stud2=new Student("Aditya");
			
			Student stud3=new Student("Ravi");
			
			Student stud4=new Student("Ronit");
			
			Course c1=new Course("Math");
			Course c2=new Course("Science");
			Course c3=new Course("Social");
			Course c4=new Course("Science");
			
			school1.addStudent(stud1);
			school1.addStudent(stud2);
			school1.addStudent(stud3);
			
			
			school2.addStudent(stud4);
			school2.addStudent(stud1);
			school2.addStudent(stud2);
			
			school3.addStudent(stud2);
			school3.addStudent(stud3);
			school3.addStudent(stud4);
			
			stud1.addCourses(c1,stud1);
			stud1.addCourses(c2,stud1);
			stud1.addCourses(c3,stud1);
			stud2.addCourses(c2,stud2);
			stud3.addCourses(c3,stud3);
			stud4.addCourses(c4,stud4);
			
			
			
			school1.showDetail();
			school2.showDetail();
			school3.showDetail();
			
			
			
			
			
		}
	}