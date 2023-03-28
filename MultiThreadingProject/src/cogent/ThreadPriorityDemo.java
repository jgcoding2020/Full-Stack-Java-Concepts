package cogent;

public class ThreadPriorityDemo extends Thread{

	@Override
	public void run(){
		System.out.println("Thread name is: " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args){
		ThreadPriorityDemo tpd = new ThreadPriorityDemo();
		tpd.setPriority(MAX_PRIORITY);
		tpd.setName("Hercules");
		tpd.start();
		
		ThreadPriorityDemo tpd2 = new ThreadPriorityDemo();
		tpd2.setPriority(MIN_PRIORITY);
		tpd2.setName("Xena");
		tpd2.start();	
	}
}
