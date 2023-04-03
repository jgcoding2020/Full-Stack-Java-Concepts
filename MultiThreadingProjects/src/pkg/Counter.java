package pkg;

class Counter implements Runnable{
	
	Printer printer;
	
	Counter(Printer printer){
		this.printer = printer;
		new Thread(this, "Counter").start();
	}
	
	public void run() {
		int i = 0;
		while(true) {
			i++;
			printer.putCount(i);
		}
	}
}
