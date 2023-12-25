import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class Problem_52 extends ConsoleProgram {
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Problem_52.java"));
			
			while (true) {
				String s = reader.readLine();
				if (s == null) {
					break;
				} else {
					println(s);
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
				
	}
}
