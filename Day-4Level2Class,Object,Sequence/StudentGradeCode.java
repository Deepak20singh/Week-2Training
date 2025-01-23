import java.util.*;

class Student{
	private String studentName;
	private double total=0;
	private double counter=0;
	private ArrayList<Subject> subject;
	public Student(String studentName){
		this.studentName=studentName;
		this.subject= new ArrayList<>();
		
	}
	public void addSubject(Subject s1,int mark){
		s1.setMark(mark);
		total=total+mark;
		counter++;
	}
	
	
	public void calculate(){
		GradeCalculator g1=new GradeCalculator(total,counter);
		System.out.println("Name of the student :- "+studentName);
		g1.show();
		System.out.println();
	}
		
	
		
}
class Subject{
	private String subjectName;
	private int subjectNumber;
	public Subject(String subjectName){
		this.subjectName=subjectName;
	}
	public void setMark(int subjectNumber){
		this.subjectNumber=subjectNumber;
	}
	public int getMark(){
	return subjectNumber;}
}
class GradeCalculator{
	private double result;
	private String grade;
	public GradeCalculator(double sum,double counter){
		result=sum/counter;
		if(result>90){
			grade="A";
		}
		else if(result>80){
			grade="B";
		}
		else if(result>70){
			grade="C";
		}
		else if(result>60){
			grade="D";
		}
		else if(result>40){
			grade="E";
		}
		else{
			grade="F";
	}}
	public void show(){
	System.out.println("The grade of the student is "+grade);
	}
	
}
	public class StudentGradeCode{
		public static void main(String args[]){
			Student c1=new Student("Dev");
			Student c2=new Student("Aditya");
			Student c3=new Student("John");
			
			
			Subject s1=new Subject("Math");
			Subject s2=new Subject("Science");
			Subject s3=new Subject("Social");
			Subject s4=new Subject("Biology");
			
			
			
			c1.addSubject(s1,89);
			c1.addSubject(s3,98);
			c1.addSubject(s4,70);
			
			c2.addSubject(s2,90);
			c2.addSubject(s1,91);
			c2.addSubject(s3,93);
			
			c3.addSubject(s1,90);
			c3.addSubject(s2,85);
			
			
			
			c1.calculate();
			c2.calculate();
			c3.calculate();
			
			
		}
	}