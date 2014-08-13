package persona;

public class Persona
{
	private int gameID;
	private Role role;
	
	public Persona(int gameID, Role role)
	{
		this.gameID = gameID;
		this.role = role;
	}
	
	public int getGameID()
	{
		return gameID;
	}
	
	public Role getRole()
	{
		return role;
	}
	
	public void setRole(Role role)
	{
		this.role = role;
	}
}
