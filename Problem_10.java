import stanford.karel.SuperKarel;

public class Problem_10 extends SuperKarel {
	public void run() {
		getTo2x1();
		divide();
	}
	
	public void getTo2x1() {
		turnLeft();
		move();
	}
	
	private void divide() {
		move();
		while (beepersPresent()) {
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			pickBeeper();
			move();
			pickBeeper();
			turnAround();
			move();
		}
		move();
		putBeeper();
		move();
		while (beepersPresent()) {
			pickBeeper();
			turnAround();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
		}
		turnAround();
		move();
		move();
		move();
		turnAround();
	}
}
