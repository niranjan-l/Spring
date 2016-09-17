package threads;

public class Thread_Ex extends Thread{
	
	public static void main(String[] args) {
		Thread_Ex t1 = new Thread_Ex();
		t1.setName("first");
		Thread_Ex t2 = new Thread_Ex();
		t2.setName("second");
		t1.start();
		
		try {
			
			t2.start();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
@Override
public void run() {
	// TODO Auto-generated method stub
	
	for(int i=0;i<20;i++){
	
		System.out.println(Thread.currentThread().getName());
		System.out.println(i);
	}
}
	
	
}
