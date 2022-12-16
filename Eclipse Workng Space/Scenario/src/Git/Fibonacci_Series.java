package Git;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci_Series obj = new Fibonacci_Series();
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
			int third = first + second;
			first = second;
			second = third;
		}
	}

}
