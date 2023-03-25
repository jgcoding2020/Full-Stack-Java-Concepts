package abstract_demo;

import java.util.Random;

public class TestCompartment {
	
	public static void main(String[] args){
		Compartment[] compartmentList = new Compartment[10];
		
		Random rand = new Random();
		
		for (int i = 0; i < compartmentList.length; i++){
			int randNum = rand.nextInt(4);
			
			if (randNum == 0){
				Compartment firstClass = new FirstClass();
				compartmentList[i] = firstClass;
			} 
			else if (randNum == 1){
				Compartment ladies = new Ladies();
				compartmentList[i] = ladies;
			} 
			else if (randNum == 2){
				Compartment general = new General();
				compartmentList[i] = general;
			}
			else {
				Compartment luggage = new Luggage();
				compartmentList[i] = luggage;
			}
		}
		
		for (int j = 0; j < compartmentList.length; j++){
			compartmentList[j].notice();
		}
	}
}
