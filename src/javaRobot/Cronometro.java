package javaRobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Cronometro {

	int sum = 0;

	int h = 0, h2 = 0;
	int m = 0, m2 = 0;
	int s = 0, s2 = 0;
	int contador = 0;

	public void crono() throws InterruptedException, AWTException {

		while (true) {
			Thread.sleep(1000);
			s += 1;
			s2 += 1;
			System.out.println(h2 + ":" + m2 + ":" + s2);

			// timer
			if (s2 == 60) {
				m2 += 1;
				s2 = 0;
			}

			if (m2 == 60) {
				h2 += 1;
				m2 = 0;
			}
//teste  
//			if(s2 == 5) {
//				
//				s2=0;
//				upateCrono();
//			}
			
//			if(m2 ==60) {
//				m2=0;
//				upateCrono();
//			}
			if (h2 == 1) {
				h2 = 0;
				upateCrono();
			}

		}

	}

	public void upateCrono() throws AWTException {

		contador += 1;
		Robot optimusPrime;
		optimusPrime = new Robot();
		optimusPrime.setAutoDelay(1000);

		// move mouse para x,y
		optimusPrime.mouseMove(1225, 445);

		optimusPrime.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		optimusPrime.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		optimusPrime.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		optimusPrime.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		System.out.println("Numero de Atualizações: " + contador);

	}

	public void atualizarPc() throws AWTException {
		Robot optimusPrime;
		optimusPrime = new Robot();
		optimusPrime.setAutoDelay(1000);

		// move mouse para x,y
		optimusPrime.mouseMove(1400, 750);

		optimusPrime.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		optimusPrime.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		// move mouse para x,y
		optimusPrime.mouseMove(1225, 445);

		optimusPrime.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		optimusPrime.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);

		// move mouse para x,y
		optimusPrime.mouseMove(1225, 500);
		optimusPrime.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		optimusPrime.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

	}

}
