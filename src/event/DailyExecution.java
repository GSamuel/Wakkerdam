package event;

import other.Village;

public class DailyExecution extends GameEvent
{
	public DailyExecution()
	{
		eventName = EventChooser.DAILY_EXECUTION;
		maxDuration = 40000;
	}

	@Override
	public boolean isLegalVote(Village village, Vote vote)
	{
		return (vote.getSource() != vote.getTarget());
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
