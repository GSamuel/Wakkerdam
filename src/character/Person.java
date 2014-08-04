package character;

public class Person
{
	private PersonalData personalData;
	private GameData gameData;

	public Person(PersonalData personalData)
	{
		this.personalData = personalData;
		this.gameData = new GameData();
	}

	public String toString()
	{
		return personalData.toString();
	}
	
	public GameData getGameData()
	{
		return gameData;
	}

}
