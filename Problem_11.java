import stanford.karel.SuperKarel;

public class Problem_11 extends SuperKarel {
	
	public void run() {
		while (noBeepersPresent()) {
			solution();
		}

	}
	
	private void solution() {
		if(noBeepersPresent()) {
			while (rightIsBlocked()) {
				if (frontIsClear()) {
					if(noBeepersPresent()) {
						move();
					}
				} else {
					if (leftIsClear()) {
						if(noBeepersPresent()) {
							turnLeft();
							move();
						}

					} else {
						if(noBeepersPresent()) {
							turnAround();
							move();
						}


					}
				}
			} 
			if (noBeepersPresent()) {
				while (rightIsClear()) {
					if(noBeepersPresent()) {
						turnRight();
						move();
					}
				}
			}

		}

	}
	
}
