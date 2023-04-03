package pkg;

public class Printer extends Thread{

	int count;
	boolean flag;
	
	synchronized void putCount(int count){
		while (flag)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		this.count = count;
		flag = true;
		System.out.println("Count produced: " + count);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		notify();
		}
	
	synchronized int getCount(){
		while (!flag)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		System.out.println("Count consummed:" + count);
		flag = false;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		notify();
		return count;
	}
	
	public static void main(String[] args){
		Printer printer = new Printer();
		new Counter(printer);
		new Storage(printer);
	}
}