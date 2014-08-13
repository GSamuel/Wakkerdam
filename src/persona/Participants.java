package persona;

import java.util.ArrayList;
import java.util.Iterator;

public class Participants
{
	private ArrayList<Persona> participants;

	public Participants()
	{
		participants = new ArrayList<Persona>();
	}

	public Persona getPersonaWithID(int gameID)
	{
		for (Iterator<Persona> i = participants.iterator(); i.hasNext();)
		{
			Persona persona = i.next();
			if (persona.getGameID() == gameID)
				return persona;
		}
		return null;
	}
	
	public Iterator<Persona> iterator()
	{
		return participants.iterator();
	}

	public void addPersona(int gameID, Role role)
	{
		participants.add(new Persona(gameID, role));
	}

	public void removePersona(int gameID)
	{
		for (Iterator<Persona> i = participants.iterator(); i.hasNext();)
			if (i.next().getGameID() == gameID)
				i.remove();
	}
}
