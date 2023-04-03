package synchronization;

public class DisplayMessage {

	public synchronized void sayGoodbye(String name){
		for (int i = 0; i < 15; i++){
			System.out.println("Goodbye " + name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted exception occurred");
			}
		}
	}
}
