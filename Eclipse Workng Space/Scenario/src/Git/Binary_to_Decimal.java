package Git;

import java.util.Scanner;

public class Binary_to_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_to_Decimal obj = new Binary_to_Decimal();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary Value: ");
		int no = sc.nextInt();
		obj.Print(no);
	}

	public void Print(int no) {
		// TODO Auto-generated method stub
		int decimal = 0;
		int pow = 0;
		while(no>0) {
			int rem = no%10;
			int result = rem * Print2(2,pow);
			decimal = decimal + result;
			pow++;
			no=no/10;
		}
		System.out.println("Decimal is "+decimal);
	}
	public int Print2(int no, int no2) {
		// TODO Auto-generated method stub
		int Box = 1;
		int i = 1;
		while(i<=no2) {
			Box = Box * no;
			i++;
		}
		return Box;
	}
}
