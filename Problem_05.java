import stanford.karel.SuperKarel;

public class Problem_05 extends SuperKarel{
	
	public void run() {
		while(frontIsClear()) {
			if(noBeepersPresent()) {
				putBeeper();
			}
			if(frontIsClear()) {
				move();
			}
//			if(frontIsBlocked()) {
//				putBeeper();
//			}
		}
		putBeeper();
	}
}
