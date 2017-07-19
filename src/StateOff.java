/*
 * Participant: ConcreteState
 */

public class StateOff implements FanState {
	
	public StateOff() {
		System.out.println("Fan is off");
	}

	@Override
	public void goNext(FanContext context) {
		context.setState(new StateLow());
	}
	
}
