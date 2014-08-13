package input;

import java.util.Scanner;

public class BasicUserInput
{
	private static Scanner scanner = new Scanner(System.in);
	
	public int askForNumber()
	{
		return scanner.nextInt();
	}
}
