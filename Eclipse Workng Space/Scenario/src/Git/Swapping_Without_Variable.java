package Git;

import java.util.Scanner;

public class Swapping_Without_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swapping_Without_Variable obj = new Swapping_Without_Variable();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		int no1 = sc.nextInt();
		System.out.println("Enter Number 2: ");
		int no2 = sc.nextInt();
		obj.Print(no1,no2);
	}
	private void Print(int no1, int no2) {
		// TODO Auto-generated method stub
		no1 = no1+no2;
		no2 = no1-no2;
		no1 = no1-no2;
		System.out.print("no1 = "+no1+"\nno2 = "+no2);
	}
}
