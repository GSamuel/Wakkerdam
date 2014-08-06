package other;
import card.CardChooser;
import character.People;
import character.Person;
import character.PersonalGameData;
import event.EventChooser;
import event.EventManager;

public class Village
{
	private int size;
	private Deck deck;
	private EventManager eventManager;
	
	private boolean isDay;
	private int cycle;
	
	private People village;

	public Village(int size)
	{
		this.size = size;
		village = new People();
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
		village.addPerson(person);
	}

	public void prepareGame()
	{
		initDeck();
		for (int i = 0; i < village.size(); i++)
			village.getPeople().get(i).setPersonalGameData(
					new PersonalGameData(deck.drawCard(), i));
		
		eventManager = new EventManager(this);
		//eventManager.addEvent(EventChooser.WEREWOLF_NIGHT.get());
		eventManager.start();
		cycle = 1;
		isDay = false;

	}
	
	public void execute()
	{
		for (int i = 0; i < village.size(); i++)
			village.getPeople().get(i).execute(this);
		
		if(isDay)
			cycle++;
		isDay = !isDay;
	}
	
	public void update()
	{
		eventManager.update();
	}
	
	public Person getPersonWithID(int id)
	{
		return village.getPerson(id);
			
	}
	
	public People getPeople()
	{
		return village;
	}
	
	public EventManager getEventManager()
	{
		return eventManager;
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
