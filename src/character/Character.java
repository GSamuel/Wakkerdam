package character;

public class Character
{
	private String name;
	private Gender gender;
	private Age age;
	//private Race race;
	
	public Character(String name, Gender gender, Age age)
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
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
}
