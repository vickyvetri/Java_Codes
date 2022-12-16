package Looping;

public class Example4 {
public static void main(String[] args) {
	Example4 obj = new Example4();
	obj.Print();
}

private void Print() {
	int i = 0;
    while (true)  //EndlessLoop 
    {
        System.out.println(i++);
    }
}
}
