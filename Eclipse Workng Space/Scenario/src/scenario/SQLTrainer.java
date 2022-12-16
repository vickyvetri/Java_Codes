package scenario;

class SQLTrainer extends Trainer {
 
public SQLTrainer(String dept, String institute) {
		super(dept, institute);
	}

public static void main(String[] args) {
	SQLTrainer ram = new SQLTrainer("IT","Payilagam");
	ram.trainig();
	System.out.println(ram.getSalry());
}
}
