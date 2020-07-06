package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		Thread[] threads = new Thread[5];

Robot[] robots = new Robot[5];

for (int i = 0; i < robots.length; i++) {
	robots[i]=new Robot();
	robots[i].setX(100+100*i);
	robots[i].setY(500);
}
boolean check =false;
while (check==false) {
	

    	for (int i = 0; i < robots.length; i++) {
    		robots[i].setSpeed(50);
    		if (robots[i].getY()<=100) {
				check=true;
				System.out.println("Robot " + (i+1) + " won the race!");
    		}
			Random rand = new Random();
			robots[i].move(rand.nextInt(100));
			
		}
}

	}

	
	
	
}
