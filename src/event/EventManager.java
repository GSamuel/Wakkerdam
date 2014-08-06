package event;

import java.util.Vector;

import other.Village;

public class EventManager
{
	private Village village;
	private Vector<GameEvent> gameEvents;

	public EventManager(Village village)
	{
		/*SimpleInput input = new SimpleInput(this);
		input.setVisible(true);*/
		
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

	public void update()
	{
		if(gameEvents.size() > 0)
		{
			if(!gameEvents.get(0).hasBeenStarted())
				gameEvents.get(0).start();
			
			if(gameEvents.get(0).eventDone())
				gameEvents.remove(0);
			else
				gameEvents.get(0).update(village);
		}
		else
		{
			gameEvents.add(EventChooser.WEREWOLF_NIGHT.get());
			gameEvents.add(EventChooser.DAILY_EXECUTION.get());
		}
	}
}
