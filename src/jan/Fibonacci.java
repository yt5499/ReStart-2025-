//Write a program to print the Fibonacci series up to `n` terms.

package jan;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of digits you want to print");
		int n=sc.nextInt();
		
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		
		for(int i=2 ; i<n ; i++) {
			int f=a+b;
			System.out.print(" "+f);
			a=b;
			b=f;
		}
	}
}
