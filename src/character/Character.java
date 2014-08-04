package character;

public class Character
{
	private String name;
	private Gender gender;
	private Age age;
	
	private Card card;
	
	private Race race;
	
	public Character(String name, Gender gender, Age age)
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
		
		this.card = Card.HUMAN;
		this.race = Race.HUMAN;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Gender getGender()
	{
		return gender;
	}
	
	public Age getAge()
	{
		return age;
	}
	
	public Card getCard()
	{
		return card;
	}
	
	public void setCard(Card card)
	{
		this.card = card;
	}
	
	public Race getRace()
	{
		return race;
	}
	
	public void setRace(Race race)
	{
		this.race = race;
	}
}
