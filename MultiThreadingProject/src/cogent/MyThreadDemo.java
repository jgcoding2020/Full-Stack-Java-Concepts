package cogent;

public class MyThreadDemo extends Thread {

	public MyThreadDemo(){
		super("Demo thread");
		System.out.println("The child thread: " + this);
		start();
	}
	
	@Override
	public void run(){
		for (int i = 5; i > 0; i--){
			System.out.println("child thread: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interupted exception occurred.");
			}
		}
		System.out.println("exiting child thread");
	}
	
	public static void main(String[] args){
		new MyThreadDemo();
		for (int j = 5; j > 0; j--){
			System.out.println("main thread: " + j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interupted exception occurred.");
			}
		}
		System.out.println("exiting main thread");
		
	}
}
