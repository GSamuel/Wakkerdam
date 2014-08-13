import persona.Participants;
import persona.Role;
import events.ConcreteTestEvent;
import events.GameEvent;

public class Wakkerdam_v2
{
	public static void main(String[] args)
	{	
		Participants participants = new Participants();
		initParticipants(participants);
		
		GameEvent event = new ConcreteTestEvent();
		event.addPrecondition(Role.HUMAN);
		event.execute(participants);
	}
	
	private static void initParticipants(Participants participants)
	{
		participants.addPersona(0, Role.HUMAN);
		participants.addPersona(1, Role.HUMAN);
		participants.addPersona(2, Role.HUMAN);
		participants.addPersona(3, Role.WEREWOLF);
		participants.addPersona(4, Role.WEREWOLF);
		participants.addPersona(5, Role.HUMAN);
		participants.addPersona(6, Role.HUMAN);
		participants.addPersona(7, Role.HUMAN);
		participants.addPersona(8, Role.HEALER);
		participants.addPersona(9, Role.WITCH);
	}
}
