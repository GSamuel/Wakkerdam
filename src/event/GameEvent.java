package event;

import java.util.Vector;

import other.Village;


public abstract class GameEvent implements Comparable<GameEvent>
{
	private long startTime;
	protected int maxDuration;
	private boolean started;
	private EventChooser eventName;
	protected Vector<Vote> votes;
	
	public GameEvent()
	{
		started = false;
		votes = new Vector<Vote>();
	}
	
	public boolean eventDone()
	{
		return ((System.currentTimeMillis() - startTime) > maxDuration && started);
	}
	
	public void start()
	{
		startTime = System.currentTimeMillis();
		started = true;
	}
	
	public void stop()
	{
		if(started)
			maxDuration = 0;
	}
	
	public EventChooser getEventName()
	{
		return eventName;
	}
	
	public void vote(Village village, Vote vote)
	{
		if(isLegalVote(village, vote))
			votes.add(vote);
	}
	
	public void stopAndProcessEvent(Village village)
	{
		maxDuration = 0;
		processEvent(village);
	}
	
	public abstract boolean isLegalVote(Village village, Vote vote);
	
	public abstract void processEvent(Village village);
	
	@Override
    public int compareTo(GameEvent otherEvent){
		return eventName.compareTo(otherEvent.getEventName());
    }
	
	public String toString()
	{
		if(started)
			return "duration: "+(System.currentTimeMillis() - startTime);
		else
			return "Event not started";
	}
}
