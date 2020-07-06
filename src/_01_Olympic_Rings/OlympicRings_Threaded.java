package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	Thread[] threads = new Thread[5];
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
	OlympicRings_Threaded ort = new OlympicRings_Threaded();
	ort.setup();
//	Robot rob = new Robot(600,500);
//	rob.hide();
//	rob.setPenColor(Color.BLUE);
//	Robot rob1 = new Robot(700, 500);
//	rob1.hide();
//	rob1.setPenColor(Color.BLACK);
//	Robot rob2 = new Robot(800, 500);
//	rob2.hide();
//	rob2.setPenColor(Color.RED);
//	Robot rob3 = new Robot(650, 550);
//	rob3.hide();
//	rob3.setPenColor(Color.YELLOW);
//	Robot rob4 = new Robot(750,550);
//	rob4.hide();
//	rob4.setPenColor(Color.GREEN);
//	rob.setSpeed(1000000);
//	rob1.setSpeed(1000000);
//	rob2.setSpeed(1000000);
//	rob3.setSpeed(1000000);
//	rob4.setSpeed(1000000);
//	
//	
//	rob.penDown();
//	rob1.penDown();
//	rob2.penDown();
//	rob3.penDown();
//	rob4.penDown();
//	
//	
//	for (int i = 0; i < 360; i++) {
//	rob.move(1);
//	rob.turn(1);
//		
//	rob1.move(1);
//	rob1.turn(1);
//	
//	rob2.move(1);
//	rob2.turn(1);
//	
//	rob3.move(1);
//	rob3.turn(1);
//	
//	rob4.move(1);
//	rob4.turn(1);
//	
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	rob1.move(400);
//	rob1.turn(90);
//	rob1.move(400);
//	rob2.move(400);
//	rob2.turn(90);
//	rob2.move(400);
//	rob3.move(400);
//	rob3.turn(90);
//	rob3.move(400);
//	rob4.move(400);
//	rob4.turn(90);
//	rob4.move(400);
//	
//	rob1.moveTo(150, 700);
//	rob2.moveTo(550, 700);
//	rob3.moveTo(950, 700);
//	rob4.moveTo(1350, 700);
//	
//	
//	
//	
//	
//Thread r1 = new Thread(()->rob1.move(400));
//	Thread r2 = new Thread(()->rob2.move(400));
//	Thread r3 = new Thread(()->rob3.move(400));
//	Thread r4 = new Thread(()->rob4.move(400));
//	
//	r1.start();
//	r2.start();
//	r3.start();
//	r4.start();

}
void setup() {
	
	for (int i = 0; i < threads.length; i++) {
		final int xPos = i;
		
		Thread r = new Thread(()->{
			Robot rob = new Robot(xPos*100,400);
			
			rob.setSpeed(100000);
			rob.hide();
			rob.penDown();
			for (int j = 0; j < 360; j++) {
rob.move(1);
rob.turn(1);
			}
		});
		threads[i] = r;
		threads[i].start();;
	}
	
	
}
	
	
	
	
	
}

