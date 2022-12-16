package Scenario4;

public class TamilNadu extends SouthIndia{
	
	public TamilNadu(String primeMinister) {
		super(primeMinister);
	}
	
	public TamilNadu(){}

	static String capital = "Chennai";

	@Override
	void speakLanguage() {
		System.out.println("Speking Tamil");		
	}

	@Override
	void eat() {
		System.out.println("Eating Idly");
	}

	@Override
	void dress() {
		System.out.println("wearing Traditional VestiDostis");
	}
	
	public void cultivate() 
	{
		System.out.println("Rice and Sugar cane cultivation");
	}
	public void livingStyle() {
		System.out.println("Above Average development");
	}
	public static void main(String[] args) {
		System.out.println(India.capital);
		System.out.println(TamilNadu.capital);
		
		SouthIndia si = new TamilNadu();
		si.cultivate();
		si.dress();
		si.eat();
		si.speakLanguage();
	}
}
