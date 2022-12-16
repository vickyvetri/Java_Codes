package Scenario2;

public class sivakumar extends ActorSivakumar implements Actor{
	
	public sivakumar(int Age, String Car) {
		super(Age, Car);
	}


	public static void main(String[] args) {
		
		Actor ac = new sivakumar(65,"Benz");
		ac.sing();
		ac.act();
		ac.dance();
		System.out.println(ac.address);
		
	}
}