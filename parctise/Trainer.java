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
	Trainer obj = new Trainer("CSE","Payilagam");
	obj.trainig();
	System.out.println(obj.getSalry());
}
}

