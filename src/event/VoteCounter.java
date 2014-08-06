package event;

public class VoteCounter
{
	private boolean hasMaxVotes;
	private int maxVotes;
	private boolean doubleVoting;
	private boolean voteReplacing;
	
	public VoteCounter()
	{
		hasMaxVotes = false;
		doubleVoting = false;
		voteReplacing = true;
	}
	
	public VoteCounter removeMaxVotes()
	{
		hasMaxVotes = false;
		return this;
	}
	
	public VoteCounter setMaxVotes(int max)
	{
		this.maxVotes = max;
		hasMaxVotes = true;
		return this;
	}
	
	public VoteCounter setDoubleVoting(boolean doubleVoting)
	{
		this.doubleVoting = doubleVoting;
		return this;
	}
	
	public VoteCounter setVoteReplacing (boolean voteReplacing)
	{
		this.voteReplacing = voteReplacing;
		return this;
	}
	
	
	
	public int getResult()
	{
		return 0;
	}
	
	public int getAmountVotes()
	{
		return 0;
	}
}
