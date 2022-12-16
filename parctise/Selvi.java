interface Selvaraj{
void go_GoodJob();}

// implement the Selvaraj interface
class Vicky implements Selvaraj{
public static void main(String[] args){
Selvaraj vetri = new Vicky();
vetri.go_GoodJob();
}
// implementation of abstract method
public void go_GoodJob(){System.out.println("I am looking for a good job");} 
}
