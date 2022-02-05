package methodoverriding;

public class ChipCardMachine extends SwipeMachine{
	@Override
	public void readCard() {
		System.out.println("Read Card method to read Chip Crads from Chip Card Machione Class");
	}
}
