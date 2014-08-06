package other;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

import character.Person;

public class SimpelPersonFrame extends JFrame
{
	private Person person;
	private final int WIDTH = 300;
	private final int HEIGHT = 250;
	private final int COLUMNS = 4;

	private JTable table;

	public SimpelPersonFrame(Person person)
	{
		this.person = person;

		setTitle(person.getName());
		setSize(WIDTH, HEIGHT);
		setLocation(person.getGameID() % COLUMNS * WIDTH, person.getGameID()
				/ COLUMNS * HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		getContentPane().add(panel);

		table = new JTable(3, 1);
		panel.add(table);


		update();
	}

	public void update()
	{
		table.setValueAt("gameID: " + person.getGameID(), 0, 0);
		table.setValueAt("Character: " + person.getCard().getCardName(), 1, 0);
		table.setValueAt("still alive: " + person.isAlive(), 2, 0);
	}
}
