/*
 * Participant: ConcreteState
 */

public class StateLow implements FanState {
	
	public StateLow() {
		System.out.println("Fan is at low speed");
	}

	@Override
	public void goNext(FanContext context) {
		context.setState(new StateMedium());
	}
	
}
