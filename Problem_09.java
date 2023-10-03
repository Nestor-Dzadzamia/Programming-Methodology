import stanford.karel.SuperKarel;

public class Problem_09 extends SuperKarel {
	public void run() {
		
	}
	
	private void multiply() {
		turnLeft();
		move();
		while (beepersPresent()) {
			move();
			while (beepersPresent()) {
				pickBeeper();
				move();
				putBeeper();
				move();
				putBeeper();
			}
		}
	}
}