package other;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

import character.Person;
import event.Vote;

public class SimpelPersonFrame extends JFrame
{
	private final Person person;
	private VoteController voteController;
	
	public static int WIDTH = 300;
	public static int HEIGHT = 250;
	public static int COLUMNS = 4;

	private JTable table;
	private JButton target, vote;

	public SimpelPersonFrame(Person person)
	{
		this.person = person;

		setTitle(person.getName());
		setSize(WIDTH, HEIGHT);
		setLocation(person.getGameID() % COLUMNS * WIDTH, person.getGameID()
				/ COLUMNS * HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,1));
		getContentPane().add(panel);

		table = new JTable(3, 2);
		table.setEnabled(false);
		panel.add(table);

		target = new JButton("set Target");
		panel.add(target);
		
		vote = new JButton("Vote");
		panel.add(vote);
		
		initButtons();


		update();
	}
	
	public void initButtons()
	{

		target.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				voteController.setTarget(person.getGameID());
			}
		});
		

		vote.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				voteController.vote(person.getGameID());
			}
		});
	}

	public void update()
	{
		table.setValueAt("gameID: " + person.getGameID(), 0, 0);
		table.setValueAt("gender: "+person.getGender(), 1,0);
		table.setValueAt("age: "+person.getAge(), 1,1);
		table.setValueAt("Character: " + person.getCard().getCardName(), 2, 0);
		table.setValueAt("still alive: " + person.isAlive(), 2,1);
	}
	
	public void setVoteController(VoteController voteController)
	{
		this.voteController = voteController;
	}
}
