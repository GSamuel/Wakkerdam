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
		System.out.println("legalVote: "+(village.getPersonWithID(vote.getSource()).getPersonalGameData().getCard().getCardName() == CardChooser.WEREWOLF && village.getPersonWithID(vote.getTarget()).getPersonalGameData().getCard().getCardName() != CardChooser.WEREWOLF));
		return (village.getPersonWithID(vote.getSource()).getPersonalGameData().getCard().getCardName() == CardChooser.WEREWOLF && village.getPersonWithID(vote.getTarget()).getPersonalGameData().getCard().getCardName() != CardChooser.WEREWOLF);
	
	}

	@Override
	public void processEvent(Village village)
	{
		
	}

}
