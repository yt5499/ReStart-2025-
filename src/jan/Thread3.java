package jan;

class Task extends Thread{
	private String taskName;
	
	public Task(String taskName) {
		this.taskName=taskName;
	}
	
	@Override
	public void run() {
		for(int i=1 ; i<=5 ; i++) {
			System.out.println(taskName+" is executing at iteration number: "+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				 System.out.println("YOur exception is: "+e);
			}
		}
	}
}

public class Thread3 {
	public static void main(String args[]) {
		Task t1 = new Task("Car");
		Task t2 = new Task("Bike");
		
		t1.start();
		t2.start();
		
	}
}
