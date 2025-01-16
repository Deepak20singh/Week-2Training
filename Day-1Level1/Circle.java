import java.util.Scanner;
import java.lang.*;
public class CircleArea {
	
	int radius;
	
	CircleArea(int radius){
		
		this.radius=radius;
	}
	
	void areaDisplay(){
		double area=Math.PI*radius*radius;
		System.out.printf("Area: %.2f%n",area);
	} // %.2f 
	void circumferrenceDisplay(){
		double circum=2*Math.PI*radius;
		System.out.printf("Circumferrence : %.2f%n",circum);
	} 
    }
    
   public class Circle{

    public static void main(String[] args) {
		
		//Program to Compute Area of a Circle

        Scanner sc = new Scanner(System.in);

        // Taking user input
       
		System.out.print("Enter the radius of circle : ");
        int radius = sc.nextInt();
 
        
		
		CircleArea vr=new CircleArea(radius);
		
		vr.areaDisplay();
		vr.circumferrenceDisplay();
		}
}
