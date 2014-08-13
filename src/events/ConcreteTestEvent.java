package events;

import java.util.ArrayList;
import java.util.Iterator;

import persona.Persona;

public class ConcreteTestEvent extends GameEvent
{
	@Override
	protected void execute(ArrayList<Persona> personas)
	{
		for (Iterator<Persona> it = personas.iterator(); it.hasNext();)
		{
			Persona persona = it.next();
			System.out.println(persona.getGameID() + " " + persona.getRole());
		}
	}

}
