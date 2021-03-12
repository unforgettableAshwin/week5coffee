package week5coffee;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface
{
	private OldCoffeeMachine old = new OldCoffeeMachine();

	@Override public void chooseFirstSelection()
	{
		old.selectA();
	}

	@Override public void chooseSecondSelection()
	{
		old.selectB();
	}

}
