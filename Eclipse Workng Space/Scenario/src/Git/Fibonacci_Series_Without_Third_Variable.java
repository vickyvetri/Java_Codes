package Git;

import java.util.Scanner;

public class Fibonacci_Series_Without_Third_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci_Series_Without_Third_Variable obj = new Fibonacci_Series_Without_Third_Variable();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal Value: ");
		int no = sc.nextInt();
		obj.Print(no);
	}

	private void Print(int no) {
		// TODO Auto-generated method stub
		int first = 0 ,second = 1;
		while(first<=no) {
			System.out.println(first);
			second = first + second;
			first = second - first;
		}
	}

}
