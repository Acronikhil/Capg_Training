package methodoverriding;

public class SwipeMachineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwipeMachine normal = new SwipeMachine();
		normal.readCard();
		System.out.println("*********Using normal variable*****************");
		
		normal = new ChipCardMachine();
		normal.readCard();
		
		System.out.println("*********Using chipcard refrence variable*****************");
		SwipeMachine chipCard = new ChipCardMachine();
		chipCard.readCard();
	}

}
