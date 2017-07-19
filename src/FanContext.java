/*
 * Participant: Context
 */

public class FanContext {
	
	private FanState state;
	
	public FanContext() {
		state = new StateOff();
	}
	
	public void setState(FanState state) {
		this.state = state;
	}
	
	public void pull() {
		state.goNext(this);
	}
	
}
