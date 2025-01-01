//Create a program to calculate the grade of a student using `switch`.  

package jan;

import java.util.Scanner;

public class SwitchGrade {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hey Student enter your marks(0-100) to calculate grades: ");
		int marks=sc.nextInt();
		
		String grade="";
		switch(marks/10) {
		case 10:
			grade="A+";
			break;
		case 9:
			grade="A";
			break;
		case 8:
			grade="B";
			break;
		case 7:
			grade="C";
			break;
		case 6:
			grade="D";
			break;
		case 5:
			grade="E";
			break;
		}
		
		if(marks<0 && marks>100) {
			System.out.println("Enter valid marks!");
		}
		else {
			System.out.println("Congrajulations you received "+grade+" grade in your exam");
		}
	}
}
