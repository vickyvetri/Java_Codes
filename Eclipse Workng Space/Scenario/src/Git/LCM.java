package Git;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCM obj = new LCM();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1: ");
		int no1 = sc.nextInt();
		System.out.println("Enter Number2: ");
		int no2 = sc.nextInt();
		obj.Print(no1,no2);
	}

	private void Print(int no1,int no2) {
		// TODO Auto-generated method stub
		int big = no1<no2? no1:no2;
		while(true) {
			if(big%no1==0 && big%no2==0) {
				System.out.println("Least Common Multiple is "+big);
				break;
			}
			big++;
		}
	}

}