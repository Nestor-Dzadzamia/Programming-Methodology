import stanford.karel.SuperKarel;

public class Problem_06 extends SuperKarel {
	
	public void run() {

	}
	
	private void firstAssembly() {
		turnLeft();
		move();
		while(beepersPresent()){
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
	
	private void secondAssembly() {
		move();
		while(beepersPresent()) {
			pickBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			turnAround();
		}
	}
	
}
