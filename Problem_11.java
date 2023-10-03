import stanford.karel.SuperKarel;

public class Problem_11 extends SuperKarel {
	public void run() {
		while(frontIsClear()) {
			move();
			if(frontIsBlocked()) {
				findAWay();
			}
		}
	}
	
	private void findAWay() {
		if (leftIsClear()) {
			turnLeft();
		} else {
			if (rightIsClear()) {
				turnRight();
			} else {
				turnAround();
			}
		}
	}
	
}
