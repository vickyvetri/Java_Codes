package Task;

public class Theatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Theatre raja = new Theatre();
		    int balance = raja.bookTicket(200);
		    System.out.println("After booking ticket " + balance);
		  }

		  private int bookTicket(int amount) {
		  int ticket_price = 120;
		  int balance = amount - ticket_price ;
		  return balance;
	}

}
