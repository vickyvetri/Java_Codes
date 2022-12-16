public class Loop {

	public static void main(String[] args) {
		 Loop obj = new Loop();
		 obj.Print(5);
		
	}

	public void Print(int amt) {
		int purse = 0; 
		int day = 1;
		while(day<=5)
		{
		purse = purse + amt; 
		day = day+1; 
		}
		System.out.println(purse);
	}
}
