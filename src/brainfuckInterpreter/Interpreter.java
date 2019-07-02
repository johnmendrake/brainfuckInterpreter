package brainfuckInterpreter;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Interpreter {
	// if too much time: replace with dynamic array list, creating indexes
	// containing zeros when needed
	private static int[] band = new int[30000];

	public static void main(String[] args) {
		try {
			File fuckFile = new File(args[0]);
			Scanner scLine = new Scanner(fuckFile);
			scLine.useDelimiter("\n");
			while (scLine.hasNext()) {
				String curLine = scLine.next();
				System.out.println(scLine.next());
			}
		} catch (Exception e) {
			System.out.println("something got (brain-)fucked up");
		}
	}

}
