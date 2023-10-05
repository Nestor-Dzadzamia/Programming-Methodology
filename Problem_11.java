import stanford.karel.SuperKarel;

public class Problem_11 {
	public void run() {
		int a = 10;
		int b = 15;
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.print(a + " " + b);
	}
}
