package Git;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GCD obj = new GCD();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1: ");
		int no1 = sc.nextInt();
		System.out.println("Enter Number2: ");
		int no2 = sc.nextInt();
		obj.Print(no1,no2);
	}

	private void Print(int no1,int no2) {
		// TODO Auto-generated method stub
		int div = 2;
		int gcd = 0;
    	int small = no1<no2? no1:no2;
		
		while(div<=small) {
		if(no1%div==0 && no2%div==0) {
			gcd = div;
		}
		div++;
		}
		System.out.println("Greatest Common Divisor is "+gcd);
	}
}