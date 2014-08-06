package other;

import event.EventManager;
import event.Vote;

public class VoteController
{
	private int target = 0;
	private EventManager eventManager;

	public VoteController(EventManager eventManager)
	{
		this.eventManager = eventManager;
	}

	public void setTarget(int target)
	{
		this.target = target;
		System.out.println("target: "+target);
	}
	
	public void vote (int source)
	{
		eventManager.vote(new Vote(source, target));
		System.out.println("vote: "+source+" - "+target);
	}
}
