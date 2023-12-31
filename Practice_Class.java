import stanford.karel.SuperKarel;

public class Practice_Class extends SuperKarel{
	public void run() {
		moveFirst();
		while (beepersPresent()) {
			pickBeepers();
			putBeepers();
		}

	}

	private void putBeepers() {
		turnAround();
		while (frontIsClear()) {
			move();
		}
		turnRight();
		if (frontIsClear()) {
			move();
		}
		while (beepersPresent()) {
			if (frontIsClear()) {
				move();
			}
		}
		while (beepersInBag()) {
			putBeeper();
		}
		turnAround();
		while (frontIsClear()) {
			move();
		}
		turnLeft();
		while(noBeepersPresent()) {
			if (frontIsClear()) {
				move();
			}
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
