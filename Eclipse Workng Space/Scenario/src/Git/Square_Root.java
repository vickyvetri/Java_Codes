package Git;

import java.util.Scanner;

public class Square_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square_Root obj = new Square_Root();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int no = sc.nextInt();
		obj.print(no);
	}

	private void print(int m) {
		// TODO Auto-generated method stub
		int n = 2;
		while(n<=m/2) {
			if(m/n ==n) {
				System.out.println(n);
				break;
			}
			n++;
		}
	}
}