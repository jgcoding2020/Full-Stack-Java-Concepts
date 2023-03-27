package exception_demo;

import java.util.Scanner;

public class Emp {
	
	int empId;
	String empName;
	String designation;
	double basic;
	final double hra;
	
	public Emp(int empId, String empName, String designation, double basic, double price) throws LowSalException {
		if (basic < 500)
			throw new LowSalException("Salary too low: " + basic);
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.basic = basic;
		this.hra = this.calculateHRA(price);
	}
	public void printDET(){
		System.out.println("Employee id: " + empId);
		System.out.println("Employee name: " + empName);
		System.out.println("Employee designation: " + designation);
		System.out.println("Employee basic: " + basic);
		System.out.println("Employee HRA: " + hra);
	}
	
	public double calculateHRA(double price){
		if (designation.equals("Clerk"))
			return price * .05;
		else if (designation.equals("Manager"))
			return price * .1;
		else 
			return price * .12;
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter employee id: ");
		int id = sc.nextInt();
		System.out.println("Please enter employee name: ");
		String name = sc.next();
		System.out.println("Please enter employee designation: ");
		String designation = sc.next();
		System.out.println("Please enter employee basic: ");
		double basic = sc.nextDouble();
		System.out.println("Please enter employee price: ");
		Double price = sc.nextDouble();
		
		try {
			Emp emp = new Emp(id, name, designation, basic, price);
			emp.printDET();
		} catch (LowSalException e){
			System.out.println(e.getMessage());
		}	
	}
}
