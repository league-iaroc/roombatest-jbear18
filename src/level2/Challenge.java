package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
driveDirect(477,477);
sleep(3300);
driveDirect(-400,+400);
sleep(218);
driveDirect(300,300);
sleep(345);
	}

	public void loop() {
	
	}
}
