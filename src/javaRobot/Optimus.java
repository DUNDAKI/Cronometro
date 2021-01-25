package javaRobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Optimus {

	public static void main(String[] args) throws InterruptedException, AWTException {
		int s = 0, m = 0, h = 0;

		for (int i = 0; s < 5; i++) {
			
				Thread.sleep(1000);
				s += 1;

				System.out.println(h + ":" + m + ":" + s);
				if (s == 4) {
					Robot optimusPrime;
					optimusPrime = new Robot();
					optimusPrime.setAutoDelay(1000);

					// movi mouse para x,y
					optimusPrime.mouseMove(1225, 445);

					optimusPrime.mousePress(InputEvent.BUTTON1_DOWN_MASK);
					optimusPrime.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

					int sum = s += 0;

					System.out.println("Vaor de S: " + s);
				}
				
				for (int j = 0; s == 5; j++) {
					s+=0;
				}

			

		}

	}

}
