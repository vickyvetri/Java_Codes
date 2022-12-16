package Git;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power obj = new Power();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Base: ");
		int no = sc.nextInt();
		System.out.println("Enter Number Pow: ");
		int no2 = sc.nextInt();
		System.out.println(no+" Power of "+no2+" is "+obj.Print(no,no2));
	}

	private int Print(int no, int no2) {
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