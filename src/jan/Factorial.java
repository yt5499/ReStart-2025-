//Write a program to find the factorial of a number using a loop.  

package jan;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number to fing factorial: ");
		int n=sc.nextInt();
		
		float fact=1;
		for(int i=n ; i>0 ; i--) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+"="+fact);
	}
}
