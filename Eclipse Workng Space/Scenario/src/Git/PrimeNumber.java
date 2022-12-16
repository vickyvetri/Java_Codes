package Git;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumber obj = new PrimeNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		obj.Print(sc.nextInt());

	}

	private void Print(int no) {
		// TODO Auto-generated method stub
		int div = 2;
		int count = 0;
		while(div<=no/2) {
			if(no%div==0) {
				count++;
				System.out.println("Not Prime");
				break;
			}
			div++;
		}
		if(count==0) {
			System.out.println("Prime Number");
		}
	}

}