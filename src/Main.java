/*
 * State design pattern
 */

public class Main {
	
	public static void main(String[] args) {
		
		FanContext fanChain = new FanContext();
		for (int i = 0; i < 5; i++) {
			fanChain.pull();
		}
		
	}
	
}
