package interface_demo;

public class InstrumentTest {
	
	public static void main(String[] args){
		Instrument[] instrumentList = new Instrument[10];
		
		Instrument grandPiano = new Piano();
		Instrument electricPiano = new Piano();
		Instrument babyGrandPiano = new Piano();
		Instrument brassFlute = new Flute();
		Instrument copperFlute = new Flute();
		Instrument silverFlute = new Flute();
		Instrument goldFlute = new Flute();
		Instrument accousticGuitar = new Guitar();
		Instrument electricGuitar = new Guitar();
		Instrument banjoGuitar = new Guitar();
		instrumentList[0] = grandPiano;
		instrumentList[1] = electricPiano;
		instrumentList[2] = babyGrandPiano;
		instrumentList[3] = brassFlute;
		instrumentList[4] = copperFlute;
		instrumentList[5] = silverFlute;
		instrumentList[6] = goldFlute;
		instrumentList[7] = accousticGuitar;
		instrumentList[8] = electricGuitar;
		instrumentList[9] = banjoGuitar;
		
		for (int i = 0; i < instrumentList.length; i++){
			
			if (instrumentList[i] instanceof Flute){
				System.out.print("Flute: ");
				instrumentList[i].play();
			}
			else if (instrumentList[i] instanceof Piano){
				System.out.print("Piano: ");
				instrumentList[i].play();
			}
			else {
				System.out.print("Guitar: ");
				instrumentList[i].play();
			}
		}
	}	
}
