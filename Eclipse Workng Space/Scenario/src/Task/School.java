package Task;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Exams: ");
		int len = sc.nextInt()*3;
		School obj = new School();
		int q = obj.Quart_Yearly();
		int h = obj.Half_Yearly();
		int a = obj.Annualy();
		int Total = q+h+a;
		System.out.println("Total Of All Exam Marks: "+ Total);
		System.out.println("Percentage of All Exam is: "+Total/len);
		
	}
	private int Annualy() {
		// TODO Auto-generated method stub
		System.out.println("Annual Exam Marks::");
		Scanner sc = new Scanner(System.in);
		int[] marks = new int[5];
		int sub = 1;
		int total = 0; 
		for(int i=0; i<marks.length; i++)
		{
			System.out.println("Enter Marks Subject "+sub+" : ");
			marks[i] = sc.nextInt(); 
			total = total + marks[i]; 
			sub++;
			
		}
		System.out.println("Total is "+ total);
		return total;
	}
	private int Half_Yearly() {
		// TODO Auto-generated method stub
		System.out.println("Enter Marks Half_Yearly:");
		Scanner sc = new Scanner(System.in);
		int[] marks = new int[5];
		int sub = 1;
		int total = 0; 
		for(int i=0; i<marks.length; i++)
		{
			System.out.println("Enter Marks Subject "+sub+" : ");
			marks[i] = sc.nextInt(); 
			total = total + marks[i]; 
			sub++;
			
		}
		System.out.println("Total is "+ total);
		return total;
	} 

	private int Quart_Yearly() {
		// TODO Auto-generated method stub
		System.out.println("Enter Marks Quart_Yearly:");
		Scanner sc = new Scanner(System.in); 
		int[] marks = new int[5];
		int sub = 1;
		int total = 0; 
		for(int i=0; i<marks.length; i++)
		{
			System.out.println("Enter Marks Subject "+sub+" : ");
			marks[i] = sc.nextInt(); 
			total = total + marks[i]; 
			sub++;
			
		}
		System.out.println("Total is "+ total);
		return total;
	} 
}

