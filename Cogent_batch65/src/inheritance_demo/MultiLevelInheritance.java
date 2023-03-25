package inheritance_demo;

class GrandFather {
	int grandFatherAge;
	
	public GrandFather(int GrandFatherAge){
		this.grandFatherAge = GrandFatherAge;
	}
	
	public void showGrandFatherAge(){
		System.out.println("Grand Father's Age: " + this.grandFatherAge);
	}
}

class Father extends GrandFather{
	int fatherAge;
	
	public Father(int fatherAge){
		super(fatherAge + 30);
		this.fatherAge = fatherAge;
	}
	
	public void showFatherAge(){
		showGrandFatherAge();
		System.out.println("Father's age: " + this.fatherAge);
	}
}

class Son extends Father{
	
	int sonAge;
	
	public Son(int sonAge){
		super(sonAge + 30);
		this.sonAge = sonAge;
	}
	
	public void showSonAge(){
		showFatherAge();
		System.out.println("Son's age: " + this.sonAge);
	}
}

public class MultiLevelInheritance {
	
	public static void main(String[] args){
		Son son = new Son(20);
		son.showSonAge();
	}
}
