package Git;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome obj = new Palindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int no = sc.nextInt();
		obj.Print(no);
	}

	private void Print(int no) {
		// TODO Auto-generated method stub
		int no1 = no;
		int Rev = 0;
		while(no>0) {
			int rem = no%10;
			Rev = (Rev*10)+rem;
			no/=10;
		}
		if(no1==Rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}

