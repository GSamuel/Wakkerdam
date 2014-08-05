package event;

public class Vote
{
	private int source;
	private int target;
	
	public Vote(int source, int target)
	{
		this.source = source;
		this.target = target;
	}
	
	public int getSource()
	{
		return source;
	}
	
	public int getTarget()
	{
		return target;
	}
}
