package other;
import java.util.Vector;

import card.CardChooser;
import character.Person;
import character.PersonalGameData;

public class Village
{
	private int size;
	private Vector<Person> village;
	private Deck deck;
	
	private boolean isDay;
	private int cycle;

	public Village(int size)
	{
		this.size = size;
		village = new Vector<Person>();
		initDeck();
	}

	private void initDeck()
	{
		deck = new Deck();
		deck.addCard(CardChooser.HUMAN.get(), 6);
		deck.addCard(CardChooser.WEREWOLF.get(), 2);
		deck.addCard(CardChooser.CLAIRVOYANT.get());
		deck.addCard(CardChooser.HUNTER.get());
		deck.shuffle();
	}

	public void addPerson(Person person)
	{
		village.add(person);
	}

	public void prepareGame()
	{
		initDeck();
		for (int i = 0; i < size; i++)
			village.get(i).setPersonalGameData(
					new PersonalGameData(deck.drawCard(), i));
		
		cycle = 1;
		isDay = false;

	}
	
	public void execute()
	{
		for (int i = 0; i < village.size(); i++)
			village.get(i).execute(this);
	}
	
	public Vector<Person> getPeople()
	{
		return village;
	}

	public int getSize()
	{
		return size;
	}
	
	public int getCycle()
	{
		return cycle;
	}
	
	public boolean isDay()
	{
		return isDay;
	}
}
