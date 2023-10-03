import stanford.karel.SuperKarel;

public class Problem_08 extends SuperKarel {
	public void run() {
		turnLeft();
		move();
		move();
		subtract();
	}
	
	private void subtract() {
		while (beepersPresent()) {
			pickBeeper();
			turnAround();
			move();
			pickBeeper();
			turnAround();
			move();
		}
		turnAround();
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
	}
}