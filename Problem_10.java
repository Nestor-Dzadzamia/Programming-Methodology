import stanford.karel.SuperKarel;

public class Problem_10 extends SuperKarel {
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
	}
}
