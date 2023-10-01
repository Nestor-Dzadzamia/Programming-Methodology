import stanford.karel.SuperKarel;

public class Problem_07 extends SuperKarel {
	
	public void run() {
		while(frontIsClear()) {
			if(noBeepersPresent()) {
				putBeeper();
			}
			move();
			if(frontIsBlocked()) {
				if(facingEast()) {
					if(leftIsClear()) {
						turnLeft();
						move();
						turnLeft();
					}
				} else {
					if(rightIsClear()) {
						turnRight();
						move();
						turnRight();
					}
				}
			}
		}
	}
}
