import java.util.Vector;

import card.CardChooser;
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
		deck.addCard(CardChooser.HUMAN.get(), 6);
		deck.addCard(CardChooser.WEREWOLF.get(), 2);
		deck.addCard(CardChooser.CLAIRVOYANT.get());
		deck.addCard(CardChooser.HUNTER.get());
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
