package exception_demo;

import java.util.Scanner;

public class CalcAverage {

	public double avgFirstN(int N) throws IllegalArgumentException {
		if (N < 0 || (N % 1) >= 0)
			throw new IllegalArgumentException();
		int sum = 0;
		for (int i = 0; i < N; i++){
			sum += (double)i;
		}
		
		double avgSum = sum/N;
		return avgSum;
	}
	
	public static void main(String[] args){
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a natural number N: ");
			int N = sc.nextInt();
			CalcAverage calcAvg = new CalcAverage();
			System.out.println(calcAvg.avgFirstN(N));
		} catch (IllegalArgumentException e){
			System.out.println("Exception handled: enter non zero or decimal number");
			e.printStackTrace();
		} finally {
			System.out.println("after exception");
		}
	}
}
