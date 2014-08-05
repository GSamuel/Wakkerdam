package character;

public class PersonalData
{

	private String name;
	private Gender gender;
	private Age age;
	
	public PersonalData(String name, Gender gender, Age age)
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

	public String toString()
	{
		return this.name + " " + this.gender + " " + this.age;
	}
}
