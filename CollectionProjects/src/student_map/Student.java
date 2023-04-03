package student_map;

import java.util.HashMap;
import java.util.Set;

public class Student {
	private HashMap<String, String> empNames = new HashMap<>();
	
	public void setNames(String rollno, String name){
		empNames.put(rollno, name);
		System.out.println("Student " + name + " set");
	}
	
	public void printNames(){
		System.out.println("Print student: ");
		System.out.println(empNames);
	}
	
	public void getName(String key){
		System.out.println("Get student " + key + ":");
		System.out.println(empNames.get(key));
	}
	
	public void printNamesKeySet(){
		System.out.println("Print student keys: ");
		Set<String> keySet = empNames.keySet();
		System.out.println(keySet);
		
	}
	
	public void printSize(){
		System.out.println("Print number of students: ");
		System.out.println(empNames.size());
	}
	
	public void remove(String key){
		System.out.println("Remove student by key " + key + ":");
		empNames.remove(key);
	}
}
