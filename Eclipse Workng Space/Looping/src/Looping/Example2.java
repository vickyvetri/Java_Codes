package Looping;

//import java.util.Scanner;

class Example2 {
public static void main(String[] args) {
	Example2 obj = new Example2();
	 	obj.Print();
		
}

private void Print() {
	// TODO Auto-generated method stub
	for(int row=1;row<=7;row++) {
		if(row==1 || row==7) {
			for(int hash=1;hash<=8;hash++) {
				if(hash==1 || hash==6) {
					System.out.print(" ");
				}
				else
					System.out.print("* ");
			}
		}
		else {
	for(int col=1;col<=7;col++){
			if(col==1) {
				System.out.print("* ");
			}
			else if(col==7) {
				System.out.print(" *");
			}
			else {
				System.out.print("  ");
				}
		}
	}
		System.out.println();
		}
	for(int row=1;row<=7;row++) {
		if(row==7) {
			for(int hash=1;hash<=8;hash++) {
				if(hash==1||hash==7) {
					System.out.print(" ");
				}
				else
					System.out.print("* ");
			}
		}
		else {
	for(int col=1;col<=7;col++){
			if(col==1) {
				System.out.print("* ");
			}
			else if(col==7) {
				System.out.print(" *");
			}
			else {
				System.out.print("  ");
				}
		}
	}
		System.out.println();
		}
	
	}
}

