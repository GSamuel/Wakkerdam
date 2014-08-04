import java.util.Vector;

import card.Card;
import character.Person;


public class Village
{
	private int size;
	private Vector<Person> village;
	private Deck deck;
	
	public Village(int size)
	{
		this.size = size;
		village = new Vector<Person>();
		initDeck();
	}
	
	private void initDeck()
	{		
		deck = new Deck();
		deck.addCard(Card.HUMAN, 6);
		deck.addCard(Card.WEREWOLF, 2);
		deck.addCard(Card.CLAIRVOYANT);
		deck.addCard(Card.HUNTER);
		deck.shuffle();		
	}
	
	public void addPerson(Person person)
	{
		person.setCard(deck.drawCard());
		village.add(person);
	}
	
	public int getSize()
	{
		return size;
	}
}
