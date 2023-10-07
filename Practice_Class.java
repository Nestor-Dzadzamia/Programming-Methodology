import stanford.karel.SuperKarel;

public class Practice_Class extends SuperKarel{
	public void run() {
		moveFirst();
		pickBeepers();
		putBeepers();
	}

	private void putBeepers() {
		turnAround();
		while (frontIsClear()) {
			move();
		}
		turnRight();
		move();
		while (beepersPresent()) {
			move();
		}
		while (beepersInBag()) {
			putBeeper();
		}
		turnAround();
		while (frontIsClear()) {
			move();
		}
		turnRight();
		while(noBeepersPresent()) {
			move();
		}
		
	}

	private void moveFirst() {
		move();
		while (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
		turnRight();
		move();
		while (beepersInBag()) {
			putBeeper();
		}
		turnAround();
		move();
		turnLeft();
		move();
	}

	private void pickBeepers() {
		while (noBeepersPresent()) {
			move();
		}
		
		while (beepersPresent()) {
			pickBeeper();
		}
	}


}
