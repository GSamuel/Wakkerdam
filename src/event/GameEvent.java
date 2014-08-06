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
	
	private boolean eventDone;
	
	public GameEvent()
	{
		started = false;
		eventDone = false;
		votes = new Vector<Vote>();
	}
	
	public boolean eventDone()
	{
		return eventDone;
	}
	
	public boolean timeOver()
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
			eventDone = true;
	}
	
	public EventChooser getEventName()
	{
		return eventName;
	}
	
	public void vote(Village village, Vote vote)
	{
		if(started && !eventDone)
		if(isLegalVote(village, vote))
			votes.add(vote);
	}
	
	public void update(Village village)
	{
		if(!eventDone)
			eventDone = timeOver();
		
		if(eventDone)
			processEvent(village);
	}
	
	public void reset()
	{
		started = false;
		eventDone = false;
		eventDone = false;
		votes.clear();
		start();
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
