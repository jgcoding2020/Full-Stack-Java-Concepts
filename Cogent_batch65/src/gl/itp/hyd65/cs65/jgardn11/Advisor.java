package gl.itp.hyd65.cs65.jgardn11;

import java.util.Random;

public class Advisor {
	
	String[] message;

	public Advisor(){
		message = new String[5];
		message[0] = "Yes";
		message[1] = "No";
		message[2] = "Stop";
		message[3] = "Go";
		message[4] = "Begin";
	}
	
	public String getAdvise(){
		Random rand = new Random();
		int randNum = rand.nextInt(5);
	
		return message[randNum];
	}
}
