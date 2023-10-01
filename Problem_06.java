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
	
}
