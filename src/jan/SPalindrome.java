//Implement a program to check whether a given string is a palindrome.

package jan;

import java.util.Scanner;

public class SPalindrome {
	public static boolean isPal(String str) {
		str=str.toLowerCase();
		
		String rev="";
		for(int i=str.length()-1 ; i>=0 ; i--) {
			rev+=str.charAt(i);
		}
		
		return str.equals(rev);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String str=sc.next();
		
//		SPalindrome sp = new SPalindrome();
		boolean res = isPal(str);
		
		if(res==true) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
	}
}
