import stanford.karel.SuperKarel;

public class Additional_Problems_5 extends SuperKarel {
	public void run() {
		if (frontIsClear()) {
			fillTheBox();
			moveToTheRightCorner();
			takeBeepersToLeftSide();
			while (beepersPresent()) {
				moveToTheRightCorner();
				takeBeepersToLeftSide();
			}
			moveTopLeft();
			takeBeepersTo1x1();
			while (beepersPresent()) {
				takeBeepersTo1x1();
			}
		} else {
			if (leftIsClear()) {
				turnLeft();
				while (noBeepersPresent()) {
					putBeeper();
					if (frontIsClear()) {
						move();
					}
				}
				turnAround();
				while (beepersPresent()) {
					if(frontIsClear()) {
						if(rightIsBlocked()) {
							pickBeeper();
							while (frontIsClear()) {
								move();
							}
							putBeeper();
							turnAround();
							while (frontIsClear()) {
								move();
							}
							turnAround();
							while (noBeepersPresent()) {
								if (frontIsClear()) {
									move();
								} 
							}
						}
					}
				}
			}
		}

	}

	private void takeBeepersTo1x1() {
		while (beepersPresent()) {
			if (frontIsClear()) {
				pickBeeper();
				while(frontIsClear()) {
					move();
				}
				putBeeper();
				turnAround();
				while(frontIsClear()){
					move();
				}
				turnAround();
			}
		}
		while (noBeepersPresent()) {
			if (frontIsClear()) {
				move();
			}

		}
		
	}

	private void moveTopLeft() {
		while (frontIsClear()) {
			move();
		}
		turnRight();
		while (frontIsClear()) {
			move();
		}
		turnAround();
		
	}

	private void takeBeepersToLeftSide() {
		turnAround();
		if (frontIsClear()) {
			while (beepersPresent()) {
				if(frontIsClear()) {
					pickBeeper();
				}

				while (frontIsClear()) {
					move();
				}
				putBeeper();
				turnAround();
				while (beepersPresent()) {
					if (frontIsClear()) {
						move();
					}
				}
				turnAround();
				if (frontIsClear()) {
					move();
					if (frontIsBlocked()) {
						turnAround();
						if (frontIsClear()) {
							move();
						}

					}
				}

			}
			turnAround();
			if (frontIsClear()) {
				move();
			}

			if (leftIsClear()) {
				turnLeft();
				move();
				turnLeft();
			}
		}
	}

	private void moveToTheRightCorner() {
		if (facingWest()) {
			turnAround();
			while (frontIsClear()) {
				move();
			}
		}
	}

	private void fillTheBox() {
		while (noBeepersPresent()) {
			putBeeper();
			if (frontIsClear()) {
				move();
			} else {
				if (facingEast()) {
					rotateFromRight();
				} else {
					rotateFromLeft();
				}
			}
		}
	}

	private void rotateFromLeft() {
		if (rightIsClear()) {
			turnRight();
			move();
			turnRight();
		}
	}

	private void rotateFromRight() {
		if (leftIsClear()) {
			turnLeft();
			move();
			turnLeft();
		}
	}
}
