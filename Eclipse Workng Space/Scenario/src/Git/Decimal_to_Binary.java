package Git;

import java.util.Scanner;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Decimal_to_Binary obj = new Decimal_to_Binary();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal Value: ");
		int no = sc.nextInt();
		obj.Print(no);
	}

	private void Print(int decimal) {
		// TODO Auto-generated method stub
		String binary = "";
		while(decimal>0) {
			int rem = decimal%2;
			binary = rem + binary;
			decimal = decimal/2;
		}
		System.out.println("Binary Value is "+binary);
	}

}
