package Scenario3;

public class Samsung extends FactoryDemo{
	int price = 5000;
	
	@Override
	void verifyFingerPrint() {
		System.out.println("verified FingerPrint");
	}

	@Override
	void providePattern() {
		System.out.println("Provided Pattern");	
	}

	@Override
	int call(int seconds) {
		return 0;
	}

	@Override
	void sendMessage() {
		System.out.println("Sending Message");
	}

	@Override
	void receiveCall() {
		System.out.println("Recive Called");
	}
	
	public static void main(String[] args) {
		Samsung sam = new Samsung();
		sam.browse();
		System.out.println(sam.price);
	}
}
