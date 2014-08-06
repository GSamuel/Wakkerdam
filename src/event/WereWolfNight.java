package event;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Vector;

import other.Village;
import card.CardChooser;

public class WereWolfNight extends GameEvent
{

	public WereWolfNight()
	{
		maxDuration = 15000;
	}

	@Override
	public boolean isLegalVote(Village village, Vote vote)
	{
		return (village.getPersonWithID(vote.getSource()).getCard()
				.getCardName() == CardChooser.WEREWOLF && village
				.getPersonWithID(vote.getTarget()).getCard().getCardName() != CardChooser.WEREWOLF);
	}

	@Override
	public void processEvent(Village village)
	{
		System.out.println("process begins");
		Vector<Vote> goodVotes = new Vector<Vote>();
		
		for (int i = 0; i < votes.size(); i++)
		{
			boolean doubleVote = false;
			for (int j = i + 1; j < votes.size(); j++)
			{
				if (votes.get(i).getSource() == votes.get(j).getSource())
				{
					doubleVote = true;
				}
			}
			if(!doubleVote)
				goodVotes.add(votes.get(i));
				
		}
		System.out.println("amount of good votes: "+ goodVotes.size());

		HashMap<Integer, Integer> voteMap = new HashMap<Integer, Integer>();

		for (Vote v : goodVotes)
		{
			if (voteMap.containsKey(v.getTarget()))
				voteMap.put(v.getTarget(), voteMap.get(v.getTarget()) + 1);
			else
				voteMap.put(v.getTarget(), 1);
		}
		
		System.out.println(voteMap);
		
		Iterator<Entry<Integer, Integer>> it = voteMap.entrySet().iterator();

		int highestKey = 0;
		int highestVotes = 0;
		
		while(it.hasNext())
		{
			Entry<Integer, Integer> entry = it.next();
			
			if(entry.getValue() >  highestVotes)
			{
				highestVotes = entry.getValue();
				highestKey = entry.getKey();
			}
		}
		
		if(highestVotes > 0)
		{
			village.getPersonWithID(highestKey).isAlive(false);
			System.out.println("someone died");
		}

		votes.clear();
		goodVotes.clear();
		reset();
	}

}
