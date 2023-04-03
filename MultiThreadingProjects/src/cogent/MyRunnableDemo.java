package cogent;

public class MyRunnableDemo implements Runnable {
	
	public void run(){
		for (int i = 0; i < 10; i++){
			System.out.println("i:" + i + "\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interupted exception occurred.");
			}
		}
	}
	
	public static void main(String[] args){
		MyRunnableDemo mt = new MyRunnableDemo();
		Thread th = new Thread(mt);
		th.start();
		
		for (int j = 0; j < 10; j++){
			System.out.println("j:" + j + "\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interupted exception occurred.");
			}
		}
	}
}
