import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Problem_62 extends ConsoleProgram {
	public void run() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		while (true) {
			String input = readLine("Enter Name: ");
			if (input.equals("")) break;
			
			if (map.containsKey(input) == false) {
				map.put(input, 1);
			} else {
				int temp = map.get(input) + 1;
				map.put(input, temp);
			}
		}	
		println(map.toString());
	}
}
