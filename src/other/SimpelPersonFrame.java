package other;

import java.awt.GridLayout;

import javax.swing.JFrame;

import character.Person;

public class SimpelPersonFrame extends JFrame
{
	private Person person;
	private final int WIDTH =300;
	private final int HEIGHT =250;
	private final int COLUMNS = 4;
	
	public SimpelPersonFrame(Person person)
	{
		setTitle(person.getName());
		setSize(WIDTH,HEIGHT);
		setLocation(person.getGameID()%COLUMNS*WIDTH, person.getGameID()/COLUMNS*HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout());
	}
}
