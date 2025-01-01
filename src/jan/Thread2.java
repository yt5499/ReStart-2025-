//Implement thread synchronization to manage access to a shared resource (e.g., a counter)

package jan;

class Counter{
	private int count=0;
	
	public synchronized void increment() {
		count++;
	}
	
	public synchronized int getCount() {
		return count;
	}
}

class CounterIncre extends Thread{
	private Counter c;
	
	public CounterIncre(Counter c) {
		this.c=c;
	}
	
	@Override
	public void run() {
		for(int i=1 ; i<=1000 ; i++) {
			c.increment();
		}
	}
}

public class Thread2 {
	public static void main(String args[]) {
		Counter ct = new Counter();
		
		CounterIncre cti = new CounterIncre(ct);
		CounterIncre cti2 = new CounterIncre(ct);
		
		cti.start();
		cti2.start();
		
		try {
			cti.join();
			cti2.join();
		}catch(InterruptedException e){
			System.out.println("Exception: "+e.getMessage());
		}
		
		System.out.println("Final count: "+ct.getCount());
	}
}
