package chennai.valachery;
public class Theatre
{
static String Name = "Vicky Cinemas";
int Ticket_Price;
private int Employee_Salry = 20000;
public Theatre(){}

public Theatre(int Ticket_Price)
{
this.Ticket_Price = Ticket_Price;
}

public static void main(String[] args)
{
Theatre FirstClass = new Theatre(400);
Theatre SecondClass = new Theatre(350);
Theatre ThirdClass = new Theatre(200);
FirstClass.Book_Ticket(1);
SecondClass.Book_Ticket(2);
ThirdClass.Book_Ticket(3);
Theatre salry = new Theatre();
salry.Salry();
}
void Book_Ticket(int a)
{
int b = a;
System.out.println("The Price of The "+a +"st class Ticket is "+Ticket_Price);
}
private void Salry()
{
System.out.println("Employee Salry is "+Employee_Salry);
}
}
