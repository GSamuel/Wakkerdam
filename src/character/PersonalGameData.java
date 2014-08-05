package character;

import other.Village;
import card.Card;

public class PersonalGameData
{
	private int gameID = -1;
	private Card card;
	private boolean alive;
	
	public PersonalGameData(Card card, int gameID)
	{
		this.card = card;
		this.gameID = gameID;
		init();
	}
	
	private void init()
	{
		alive = true;
	}
	
	public void isAlive(boolean alive)
	{
		this.alive = alive;
	}
	
	public boolean isAlive()
	{
		return alive;
	}
	
	public int getGameID()
	{
		return gameID;
	}
	
	public void setGameID(int gameID)
	{
		this.gameID = gameID;
	}
	
	public Card getCard()
	{
		return card;
	}

	public void setCard(Card card)
	{
		this.card = card;
	}

	public boolean execute(Village village)
	{
		return card.getAbility().execute(village);
	}
}
