package character;

import other.Village;
import card.Card;

public class PersonalGameData
{
	private int gameID = -1;
	private Card card;
	
	public PersonalGameData(Card card, int gameID)
	{
		this.card = card;
		this.gameID = gameID;
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
