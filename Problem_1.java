import stanford.karel.SuperKarel;

public class Problem_1 extends SuperKarel{
//	 კარელი დგას 1x1 უჯრაზე. 3x1 უჯრაზე დევს ბრილიანტი, კარელმა ბრილიანტი უნდა
//	 გადაიტანოს 4x1 უჯრაზე და დაამთავროს მუშაობა.	
	public void run(){
		for(int i = 0; i < 2; i++) {
			move();
		}
		
		pickBeeper();
		move();
		putBeeper();
	}
	
}
