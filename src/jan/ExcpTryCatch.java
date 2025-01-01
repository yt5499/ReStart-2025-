//Write a program to demonstrate `try-catch` and `finally` by handling a division-by-zero error.  

package jan;

public class ExcpTryCatch {
	public static void main(String args[]) {
		int a=2;
		int b=0;
		int res;
		try {
			res=a/b;
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		finally {
			System.out.println("Try-Catch-finally blocks executed successfully!");
		}
	}
}
