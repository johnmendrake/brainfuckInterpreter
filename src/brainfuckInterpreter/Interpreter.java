package brainfuckInterpreter;

import java.io.File;
import java.util.Scanner;

public class Interpreter {
	// if too much time: replace with dynamic array list, creating indexes
	// containing zeros when needed
	private static int[] band = new int[30000];
	private static int curIndex = 0;

	public static void main(String[] args) {
		try {
			File fuckFile = new File(args[0]);
			Scanner scLine = new Scanner(fuckFile);
			scLine.useDelimiter("\n");
			while (scLine.hasNext()) {
				String curLine = scLine.next();
				System.out.println(curLine);
				while (curLine.length() > 0) {
					switch (curLine.substring(0, 1)) {
					case "<":
						decIndex();
						break;
					case ">":
						incIndex();
						break;
					case "+":
						incIndexValue();
						break;
					case "-":
						decIndexValue();
						break;
					case "[":
						break;
					case "]":
						break;
					case ",":
						break;
					case ".":
						printAsciiChar();
						break;
					default:
						break;
					}
					curLine = curLine.substring(1);
				}
			}
			scLine.close();
		} catch (Exception e) {
			System.out.println("something got (brain-)fucked up");
		}
	}

	public static void decIndex() {
		if (curIndex > 0) {
			curIndex--;
		} else {
			System.out.println("You are trying to access index < 0...");
		}
	}

	public static void decIndexValue() {
		band[curIndex]--;
	}

	public static void incIndex() {
		curIndex++;
	}

	public static void incIndexValue() {
		band[curIndex]++;
	}

	public static void printAsciiChar() {
		// TODO: actually translate to ascii
		System.out.print(band[curIndex]);
	}

}
