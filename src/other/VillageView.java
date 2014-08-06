package other;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import character.People;
import character.Person;

public class VillageView extends JFrame
{
	People people;
	VoteController voteController;
	
	
	public VillageView(Village village)
	{

		setTitle("Village info");
		setSize(SimpelPersonFrame.WIDTH, SimpelPersonFrame.HEIGHT);
		setLocation(SimpelPersonFrame.COLUMNS * SimpelPersonFrame.WIDTH, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		
		
		voteController = new VoteController(village.getEventManager());
		
		people = village.getPeople();
		
		for(Person p: people.getPeople())
			createFrame(p);
		
		

	}
	
	private void createFrame(Person p)
	{
		SimpelPersonFrame frame = new SimpelPersonFrame(p);
		frame.setVisible(true);
		frame.setVoteController(voteController);
	}
	
}
