/*
 * Participant: ConcreteState
 */

public class StateMedium implements FanState {
	
	public StateMedium() {
		System.out.println("Fan is at medium speed");
	}

	@Override
	public void goNext(FanContext context) {
		context.setState(new StateHigh());
	}
	
}
