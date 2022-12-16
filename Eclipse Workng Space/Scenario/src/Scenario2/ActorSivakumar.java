package Scenario2;

class ActorSivakumar implements Actor {
	
	static String address = "Coimbatore";
	int Age;
	String Car;
	public ActorSivakumar(int Age, String Car) {
		this.Age = Age;
		 this.Car = Car;
	}
	
	@Override
	public void act() {
		 System.out.println("Acted");
		
	}

	@Override
	public void dance() {
		System.out.println("Dancing");
	}

	@Override
	public void sing() {
		System.out.println("Singing");
	}
	public String speaking() {
		String a = "Speaking";
		return a;  
	}
	
	public static void main(String[] args) {
		
		ActorSivakumar as = new ActorSivakumar(65,"Audi Car");
		as.act();
		as.dance();
		as.sing();
		System.out.println(as.speaking());
		System.out.println(ActorSivakumar.address);		
 	}

}