//Create a custom exception class for invalid age and throw it when the user enters an age less than 18.  

package jan;

import java.util.Scanner;

class customEx extends Exception{
	public customEx(String message) {
		super(message);
	}
}

public class TryCatch2 {
	public static void validateAge(int age) throws customEx{
		if(age<18) {
			throw new customEx("INVALID || Age is under 18!");
		}else {
			System.out.println("Valid age!");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int userAge=sc.nextInt();
		
		try {
			validateAge(userAge);
		}catch (customEx c) {
			System.out.println("Exception: "+c.getMessage());
		}
		finally {
			System.out.println("Execution Successful!!!");
		}
	}
}
