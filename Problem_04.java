import stanford.karel.SuperKarel;

public class Problem_04 extends SuperKarel {
	
	public void run() {
		while(noBeepersPresent()){
			putBeeper();
			if(frontIsClear()) {
				move();
			}

		}
	}
}
