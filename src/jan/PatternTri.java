//Implement a program to print a pattern (e.g., a triangle of stars) using nested loops.  

package jan;

import java.util.Scanner;

public class PatternTri {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Number of lines you want: ");
//		int n=sc.nextInt();
		int n=3;
		
//		r=rows
//		s=spaces
//		c=star
		for(int r=1 ; r<=n ;r++) {
			for(int s=1 ; s<=n-r ; s++) {
				System.out.print(" ");
			}
			for(int c=1 ; c<=(2*r)-1 ; c++)  {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
