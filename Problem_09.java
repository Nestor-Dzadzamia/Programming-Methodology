import stanford.karel.SuperKarel;

public class Problem_09 extends SuperKarel {
	public void run() {
		multiply();
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
	}
}