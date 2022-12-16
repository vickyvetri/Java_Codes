package Git;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial obj = new Factorial();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int no = sc.nextInt();
		obj.Print(no);
	}

	private void Print(int no) {
		// TODO Auto-generated method stub
		int Fact = 1;
		int i=1;
		while(i<=no) {
			Fact = Fact*i;
			i++;
		}
		System.out.println("Factorial of "+no+" is "+Fact);
	}
}