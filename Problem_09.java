import stanford.karel.SuperKarel;

public class Problem_09 extends SuperKarel {
	public void run() {
		turnLeft();
		move();
		while (beepersPresent()) {
			turnAround();
			move();
			turnLeft();
			multiply();			
		}

	}
	
	private void multiply() {
		turnLeft();
		move();
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
		pickBeeper();
		move();
		turnLeft();
	}
}