package pkg;

public class MyThread extends Thread{

	int total;
	
	@Override
	public void run(){
		System.out.println("Child thread is calculating sum: ");
		synchronized (this){
			for (int i = 0; i < 10; i++){
				total += i;
			}
			this.notify();
		}
	}
}
