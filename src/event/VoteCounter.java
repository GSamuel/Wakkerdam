package event;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import java.util.Map.Entry;

public class VoteCounter
{
	private boolean hasMaxVotes;
	private int maxVotes;
	private boolean voteReplacing;

	private boolean filtered;
	private boolean counted;

	private int voteWinner;

	private Vector<Vote> votes;
	private Vector<Vote> filteredVotes;
	private HashMap<Integer, Integer> voteMap;

	public VoteCounter()
	{
		hasMaxVotes = false;
		voteReplacing = true;

		filtered = true;
		counted = true;

		votes = new Vector<Vote>();
		filteredVotes = new Vector<Vote>();
	}

	public void addVote(Vote vote)
	{
		votes.add(vote);
		filtered = false;
		counted = false;
	}

	public void countVotes()
	{
		filterVotes();

		if (!counted)
		{
			voteMap = new HashMap<Integer, Integer>();

			for (Vote v : filteredVotes)
			{
				if (voteMap.containsKey(v.getTarget()))
					voteMap.put(v.getTarget(), voteMap.get(v.getTarget()) + 1);
				else
					voteMap.put(v.getTarget(), 1);
			}

			Iterator<Entry<Integer, Integer>> it = voteMap.entrySet()
					.iterator();

			voteWinner = 0;
			int highestVotes = 0;

			while (it.hasNext())
			{
				Entry<Integer, Integer> entry = it.next();

				if (entry.getValue() > highestVotes)
				{
					highestVotes = entry.getValue();
					voteWinner = entry.getKey();
				}
			}

			counted = true;
		}

	}

	public void filterVotes()
	{
		if (!filtered)
		{
			filteredVotes.clear();

			for (Vote v : votes)
			{
				filterVote(v);
			}

			filtered = true;
		}
	}

	private boolean filterVote(Vote v)
	{
		for (int i = 0; i < filteredVotes.size(); i++)
		{
			if (filteredVotes.get(i).getSource() == v.getSource())
			{
				if (voteReplacing)
				{
					filteredVotes.remove(i);
					filteredVotes.add(i, v);
					return true;
				} else
					return false;
			}
		}

		if (hasMaxVotes && filteredVotes.size() >= maxVotes)
			return false;

		filteredVotes.add(v);
		return true;
	}

	public VoteCounter removeMaxVotes()
	{
		hasMaxVotes = false;

		filtered = false;
		counted = false;

		return this;
	}

	public VoteCounter setMaxVotes(int max)
	{
		this.maxVotes = max;
		hasMaxVotes = true;

		filtered = false;
		counted = false;

		return this;
	}

	public VoteCounter setVoteReplacing(boolean voteReplacing)
	{
		this.voteReplacing = voteReplacing;

		filtered = false;
		counted = false;

		return this;
	}

	public boolean hasBeenCounted()
	{
		return counted;
	}

	public int getWinner()
	{
		countVotes();
		return voteWinner;
	}

	public boolean hasBeenFiltered()
	{
		return filtered;
	}

	public int getAmountFilteredVotes()
	{
		filterVotes();
		return filteredVotes.size();
	}

	public Vote getFilteredVote(int index)
	{
		filterVotes();
		return filteredVotes.get(index);
	}
	
	public void clear()
	{
		filtered = false;
		counted = false;
		votes.clear();
		filteredVotes.clear();
	}
}
