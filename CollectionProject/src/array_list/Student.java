package array_list;

import java.util.ArrayList;

public class Student {
	private ArrayList<String> names = new ArrayList<>();
	
	public void setName(String name){
		System.out.println("The name " + name + " has been added.");
		this.names.add(name);
	}
	
	public void searchName(String name){
		System.out.println("Searching for " + name + " in the list by String type.");
		if (this.names.contains(name))
			System.out.println("The name " + name + " is in the list.");
		else
			System.out.println("The name " + name + " is not in the list.");
	}
	
	public void searchName(int index){
		System.out.println("Searching for name at index " + index + ".");
		String name = names.get(index);
		System.out.println("The name at index: " + index + " is " + name + ".");
	}

	public void printNames(){
		System.out.println("Displaying all names in the list:");
		for (Object name: names){
			System.out.print(name + " ");
		}
		System.out.println();
	}

	public void removeName(String stuName){
		System.out.println("Removing " + stuName + " from the list.");
		this.names.remove(stuName);
	}
}
