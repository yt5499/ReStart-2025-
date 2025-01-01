//Write a program to determine if a number is even or odd using `if-else`.  

package jan;

public class EvenorOdd {
	public static void checkEO(int num) {
		if(num<0) {
			System.out.println("Please enter positive number");
		}
		else if (num%2==0) {
			System.out.println(num+" Number is EVEN");
		}
		else {
			System.out.println(num+" Number is ODD");
		}
	}
	
	public static void main(String[] args) {
		int n=18;
		checkEO(n);
	}
}
