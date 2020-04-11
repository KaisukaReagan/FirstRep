package kay;
import java.util.Scanner;
public class marks {
	public static void main(String[]args) {
		Scanner scanner= new Scanner(System.in);
	System.out.println();
	int marks; 
	double gpa;
	
	

	System.out.println("enter your  course unit");
	String courseName=scanner.nextLine();
	System.out.println("enter your first course unit marks");
	marks=scanner.nextInt();
	
	
	
	
		if(marks>=80) {
			System.out.println("you have A");
			
			gpa=5;
			System.out.println("you gpa is "+gpa);
			
		}
		else if(marks>=75&& marks<79) {
			System.out.println("you have B+");
			gpa=4.5;
			System.out.println("you gpa is "+gpa);
			
		}
		else if(marks>=70&& marks<75) {
			System.out.println("you have B");
			gpa=4;
			System.out.println("you gpa is "+gpa);
			
		}
		else if(marks>=65&& marks<69) {
			System.out.println("you have C ");
			gpa=3.5;
			System.out.println("you gpa is "+gpa);
			
		}
		else if(marks>=60&& marks<65) {
			System.out.println("you have C+");
			gpa=3;
			System.out.println("you gpa is "+gpa);
			
		}

		else if(marks>=55&& marks<60) {
			System.out.println("you have D+");
			gpa=2.5;
			System.out.println("you gpa is "+gpa);
			
		}
		else if(marks>=50&& marks<55) {
			System.out.println("you have D");
			gpa=2.0;
			
			System.out.println("you gpa is "+gpa);
		}
		else {
			System.out.println("you have a retake");
			gpa=0;
			System.out.println("you gpa is "+gpa);
		}
		
		
		
		
		
		
	}

}
