package event;

import other.Village;
import card.CardChooser;

public class WereWolfNight extends GameEvent
{

	public WereWolfNight()
	{
		eventName = EventChooser.WEREWOLF_NIGHT;
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

		System.out.println("event over: " + eventName);

		if (voteCounter.getAmountFilteredVotes() > 0)
		{
			village.getPersonWithID(voteCounter.getWinner()).isAlive(false);
			System.out.println("Someone died: " + voteCounter.getWinner());
		}


		reset();
	}

}
