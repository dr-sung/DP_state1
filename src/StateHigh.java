/*
 * Participant: ConcreteState
 */

public class StateHigh implements FanState {
	
	public StateHigh() {
		System.out.println("Fan is at high speed");
	}

	@Override
	public void goNext(FanContext context) {
		context.setState(new StateOff());
	}
	
}
