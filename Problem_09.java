import stanford.karel.SuperKarel;

public class Problem_09 extends SuperKarel {
	public void run() {
		turnLeft();
		move();
		while (beepersPresent()) {
			multiply();			
			turnAround();
		}
		move();
		while(beepersPresent()) {
			pickBeeper();
		}
	}
	
	private void multiply() {
		move();
		while (beepersPresent()) {
			pickBeeper();
			move();
			putBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			turnAround();
		}
		move();
		move();
		turnAround();
		while (beepersPresent()) {
			pickBeeper();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			turnAround();
		}
		move();
		move();
		move();
		if (beepersPresent()) {
			pickBeeper();
		}

	}
}