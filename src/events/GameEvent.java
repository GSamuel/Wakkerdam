package events;

import java.util.ArrayList;
import java.util.Iterator;

import persona.Participants;
import persona.Persona;
import persona.Role;

public abstract class GameEvent
{
	private ArrayList<Role> preconditions;

	public GameEvent()
	{
		preconditions = new ArrayList<Role>();
	}

	public void addPrecondition(Role role)
	{
		preconditions.add(role);
	}
	
	public void execute(Participants participants)
	{
		ArrayList<Persona> legal = new ArrayList<Persona>();
		for(Iterator<Persona> it = participants.iterator(); it.hasNext();)
		{
			Persona persona = it.next();
			for(Iterator<Role> it2 = preconditions.iterator(); it2.hasNext();)
			{
				if(persona.getRole() == it2.next())
				{
					legal.add(persona);
					break;
				}
			}
		}
		
		execute(legal);
	}

	protected abstract void execute(ArrayList<Persona> personas);
}
