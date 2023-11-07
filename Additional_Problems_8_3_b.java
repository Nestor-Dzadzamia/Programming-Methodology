import acm.program.GraphicsProgram;

public class Additional_Problems_8_3_b extends GraphicsProgram{
	
	public void run() {
		
	}
	
	private int fibonacci(int n) {
		int first = 0;
		int second = 1;
		int count = 0;
		int temp = 0;
		
		if (n > 1) {
			while (count != n - 1) {
				 temp = first;
				 first = second;
				 second = first + temp;
				 
				 count++;
			 }
			 if (n % 2 == 0) return second;
			 else return first;
			 
		 } else if (n == 1) return first;
		 else return second;	 
	}
	
}
