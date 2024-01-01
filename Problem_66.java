import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Problem_66 extends ConsoleProgram {
	public void run() {
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>(); 
		while (true) {
			String friend1 = readLine("Enter Person's name: ");
			String friend2 = readLine("Enter Person's name: ");
			if (friend1.equals("") || friend2.equals("")) break;
			
			if (map.containsKey(friend1) == false) {
				map.put(friend1, new ArrayList<String>());
				
			}
			ArrayList<String> temp = map.get(friend1);
			temp.add(friend2);
			map.put(friend1, temp);
		}
		
		uncommonFriends(map);
	}
	
	private void uncommonFriends(HashMap<String, ArrayList<String>> map) {
		for (String person1 : map.keySet()) {
			ArrayList<String> list1 = map.get(person1);
			for (String person2 : map.keySet()) {
				ArrayList<String> list2 = map.get(person2);
				if (isUncommon(list1, list2)) {
					println("2 person with uncommon friends are : " + person1 + " " + person2);
					return;
				}
			}
		}
		println("There are no people with uncommon friends");
	}
	
	private boolean isUncommon(ArrayList<String> list1, ArrayList<String> list2) {
		for (int i = 0; i < list1.size(); i++) {
			if (list2.contains(list1.get(i))) return false;
		}
		return true;
	}
	
}
