package cogent;

public class MyThread extends Thread {
	
	public MyThread(){
		super("Super");
		System.out.println("Thread: " + this.getName());
		start();
	}
	
	@Override
	public void run(){
		for (int i = 0; i < 15; i++){
			System.out.println(this.getName() + ": " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
