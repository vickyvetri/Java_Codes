package Task;

import java.util.Scanner;

public class Eb_Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eb_Bill ad = new Eb_Bill();
		ad.getPercentage();
	}
	private void getPercentage() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Months: ");
		int len = sc.nextInt(); 
		int[] marks = new int[len];
		int total = 0; 
		int month = 1;
		for(int i=0; i<marks.length; i++)
		{
			System.out.println("Enter Month "+month+" Amount: ");
			marks[i] = sc.nextInt(); 
			total = total + marks[i]; 
			month++;
			
		}
		System.out.println("Total Amount is "+ total);
		System.out.println("Percentage is "+ total/len);
	} 
	}

