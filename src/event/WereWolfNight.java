package event;

import card.CardChooser;
import other.Village;

public class WereWolfNight extends GameEvent
{

	public WereWolfNight()
	{
		maxDuration = 5000;
	}
	
	@Override
	public boolean isLegalVote(Village village, Vote vote)
	{	
		return (village.getPersonWithID(vote.getSource()).getCard().getCardName() == CardChooser.WEREWOLF && village.getPersonWithID(vote.getTarget()).getCard().getCardName() != CardChooser.WEREWOLF);
	}

	@Override
	public void processEvent(Village village)
	{
		
	}

}
