//Write a multithreaded program using the `Thread` class to print numbers from 1 to 10.  

package jan;

class printNum extends Thread{
	int start;
	int end;
	public printNum(int s, int e) {
		this.start=s;
		this.end=e;
	}
	@Override
	public void run() {
		for(int i=start ; i<=end ; i++) {
			System.out.println(printNum.currentThread().getName()+" prints "+i);
			try {
				printNum.sleep(500);
			}catch(InterruptedException e) {
				System.out.println("Thread Interrupted Exception: "+e.getMessage());
			}
		}
	}
}

public class Thread1 {
	public static void main(String args[]) {
		printNum t1 = new printNum(1, 5);
		
		t1.start();
	}
}
