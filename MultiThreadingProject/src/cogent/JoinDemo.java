package cogent;

import java.util.Scanner;

public class JoinDemo extends Thread {

	public static int n, sum;
	
	@Override
	public void run(){
		for (int i = 0; i < JoinDemo.n; i++){
			JoinDemo.sum+=i;
		}
	}
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		System.out.println("Sum of 'N' numbers: ");
		System.out.println("Enter a value: ");
		Scanner sc = new Scanner(System.in);
		JoinDemo.n = sc.nextInt();
		
		JoinDemo jd = new JoinDemo();
		jd.start();
		
		try {
			jd.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Sum of first " + JoinDemo.n + " = " + JoinDemo.sum);
		long end = System.currentTimeMillis();
		System.out.println("Time taken is " + (end - start)/1000 + " seconds");
	}
}