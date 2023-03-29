package pkg;

class Storage implements Runnable{
	
	Printer printer;
	
	Storage(Printer printer){
		this.printer = printer;
		new Thread(this, "Consumer").start();
	}
	
	public void run() {
		while(true) {
			printer.getCount();
		}
	}
}
