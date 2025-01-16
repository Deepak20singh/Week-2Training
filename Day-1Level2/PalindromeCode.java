import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class Palindrome {
	String input;
	boolean result=true;
	
	Palindrome(String input){
		this.input=input;
		int start=0,end=input.length()-1;
		while(start<=end){
		if(input.charAt(start)!=input.charAt(end)){
				result=false;
	}
	start++;
	end--;
	}
	
	System.out.println("The given string "+input+" is "+(result?"palindrome":"not palindrome"));
	}
	
}
class PalindromeCode{
	public static void main(String args[]){
		//Program to Check Palindrome String

		Scanner sc = new Scanner(System.in);
      System.out.print("Enter the string :- ");
		String m=sc.nextLine();
		Palindrome palindrome=new Palindrome(m);
		
		
		
    }
}
	
	
	