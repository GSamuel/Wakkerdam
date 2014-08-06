package other;
import java.util.Collections;
import java.util.Vector;

import card.Card;


public class Deck
{
	
	private Vector<Card> deck;
	private Vector<Card> shuffled;
	private Vector<Card> drawn;
	
	public Deck()
	{
		deck = new Vector<Card>();
		shuffled = new Vector<Card>();
		drawn = new Vector<Card>();
	}
	
	public void addCard(Card card)
	{
		deck.add(card);
	}
	
	public void addCard(Card card, int times)
	{
		for(int i = 0; i < times; i++)
			deck.add(card);
	}
	
	public void shuffle()
	{
		while(!deck.isEmpty())
			shuffled.add(deck.remove(deck.size()-1));
		
		Collections.shuffle(shuffled);
	}
	
	public Card drawCard()
	{
		Card card = shuffled.remove(shuffled.size()-1);
		drawn.add(card);
		return card;
	}
	
	public void resetDeck()
	{
		while(!drawn.isEmpty())
			deck.add(drawn.remove(drawn.size()-1));
		
		shuffle();
	}
	
	public String toString()
	{
		String string = "Deck:\n";
		for(int i =deck.size()-1; i>=0; i--)
			string += deck.get(i)+"\n";
		
		string += "\nShuffled:\n";
		for(int i =shuffled.size()-1; i>=0; i--)
			string += shuffled.get(i)+"\n";
		
		string += "\nDrawn:\n";
		for(int i =drawn.size()-1; i>=0; i--)
			string += drawn.get(i)+"\n";
		
		return string;
	}
	
}
