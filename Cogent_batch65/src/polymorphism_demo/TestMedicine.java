package polymorphism_demo;

import java.util.Random;

public class TestMedicine {

	public static void main(String[] args){
		
		Medicine[] medicineList = new Medicine[10];
		
		Random rand = new Random();
		
		for (int i = 0; i < medicineList.length; i++){
			int randNum = rand.nextInt(3);
			
			if (randNum == 0){
				Syrup syrup = new Syrup();
				syrup.setName("syrup");
				syrup.setAddress("FL");
				medicineList[i] = syrup;
			} 
			
			else if (randNum == 1){
				Tablet tablet = new Tablet();
				tablet.setName("tablet");
				tablet.setAddress("AL");
				medicineList[i] = tablet;
			}
			
			else {
				Ointment ointment = new Ointment();
				ointment.setName("ointment");
				ointment.setAddress("NY");
				medicineList[i] = ointment;
			}
			
		}
		
		for (int j = 0; j < medicineList.length; j++){
			System.out.println("\nMedicine number: " + (j + 1));
			medicineList[j].displayLabel();
		}
	}
}
