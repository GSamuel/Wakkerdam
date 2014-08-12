package persona;

public class Persona
{
	private Role role;
	
	private int gameID;
	
	public Persona(int gameID, Role role)
	{
		
	}
	
	public void setRole(Role role)
	{
		this.role = role;
	}
	
	public Role getRole()
	{
		return role;
	}
	
	public int getGameID()
	{
		return gameID;
	}
}
