package Scenario3;

public abstract class Smartphone {
	public Smartphone()
	{
	System.out.println("Smartphone under development");
	}
	abstract int call(int seconds);
	abstract void sendMessage();
	abstract void receiveCall();
	void browse(){
		System.out.println("SmartPhone browsing");
	}
	
}
