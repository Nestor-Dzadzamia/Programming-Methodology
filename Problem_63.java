import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Problem_63 extends ConsoleProgram {
	public void run() {
		HashMap<String, Integer> map = new HashMap<String, Integer>(); 
		while (true) {
			String friend1 = readLine("Enter Person's name: ");
			String friend2 = readLine("Enter Person's name: ");
			if (friend1.equals("") || friend2.equals("")) break;
			
			if (map.containsKey(friend1) == false) {
				map.put(friend1, 1);
			} else {
				int temp = map.get(friend1) + 1;
				map.put(friend1, temp);
			}
		}
		
		int answer = 0;
		String person = "";
		for (String s : map.keySet()) {
			if (map.get(s) > answer) {
				answer = map.get(s);
				person = s;
			}
		}
		
		println(person + " is person with the most number of friends : " + answer);
	}
}
