
public class MultithreadRunnable implements Runnable{

	public void run(){
		System.out.println("My thread is in running state.");
		System.out.println("My thread is in running state.");
	}
	
	public static void main(String[] args) {
		MultithreadingDemo obj = new MultithreadingDemo();
		Thread trdobj = new Thread(obj);
		trdobj.start();
	}
}
