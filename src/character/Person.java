package character;

import card.Card;

public class Person
{
	private String name;
	private Gender gender;
	private Age age;
	
	private Card card;
	
	private Race race;
	
	public Person(String name, Gender gender, Age age)
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
	
	public Person clone()
	{
		return new Person(name, gender, age);
	}
	
	public String toString()
	{
		return this.name+" "+ this.gender+" "+this.age+" "+this.card;
	}
}
