package Git;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_Number obj = new Reverse_Number();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int no = sc.nextInt();
		obj.Print(no);
	}
	private void Print(int n) {
		// TODO Auto-generated method stub
		int Rev = 0;
		while(n>0) {
			int rem = n%10;
			Rev = (Rev*10)+rem;
			n/=10;
		}
		System.out.println(Rev);
	}
}
