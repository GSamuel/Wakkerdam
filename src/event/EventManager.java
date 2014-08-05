package event;

import java.util.Vector;

import other.Village;

public class EventManager
{
	private Village village;
	private Vector<GameEvent> gameEvents;

	public EventManager(Village village)
	{
		this.village = village;
		gameEvents = new Vector<GameEvent>();
	}

	public void start()
	{
		if (gameEvents.size() > 0)
			gameEvents.get(0).start();
	}

	public void vote(Vote vote)
	{
		if (gameEvents.size() > 0)
			gameEvents.get(0).vote(village, vote);
	}

	public void addEvent(GameEvent event)
	{
		gameEvents.add(event);
		// Collections.sort(gameEvents);
	}
}