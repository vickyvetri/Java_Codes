package scenario;

public class Trainer {
String dept = "Java";
String institute = "Payilagam";
private int salry = 1000;
public Trainer(String dept, String institute) {
	this.dept = dept;
	this.institute = institute;
}
public int getSalry() {
	return salry;
}
void trainig() {
System.out.println("Training");
}
public static void main(String[] args) {
	Trainer trainerkumar = new Trainer("CSE","Payilagam");
	System.out.println(trainerkumar.dept);
}
}
