package Looping;
import java.util.Scanner;

public class Array_Demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_Demo ad = new Array_Demo(); 
		//ad.getValues(); 
		char[] name = {'d','h','i','v','y','a','s'}; 
		//				0	1	2	3	4	5
//		ad.print_reverse(name);
	//ad.linear_search(name);
	// ad.find_given_char(name);
	//	ad.count_of_given_char(name);
	//	ad.last_occurrence(name); 
		// ad.replace('s', name);
	//	ad.replace_center('V', name);
		int[] ar = {10,0,2,8,3,6,4,7,8,2,0};
		ad.adjacent(ar);
	//	int[] ar = {-10,-3, -7, -12, -11}; 
	//	ad.find_biggest(ar);
	//	ad.find_smallest(ar); 
	//	ad.store_reverse(name);
		//ad.Second_Big();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Array Len: ");
//		int len = sc.nextInt();
//		int A[]=new int[len];
//		int a=1;
//		for(int i=0;i<=A.length-1;i++) {
//			System.out.println("Enter the value "+a+" : ");
//			A[i]=sc.nextInt();
//			a++;
//		}
//		for(int i=0;i<=A.length-1;i++) {
//			System.out.print(A[i]+" ");
//		}

	}

	private void adjacent(int[] ar) {
		// TODO Auto-generated method stub
		for(int i=0; i<ar.length-1;i++)
		{
		if(ar[i] + ar[i+1]==10)
		{
			System.out.println(ar[i]+ " "+ ar[i+1]);
		}
		} 
	}

	private void Second_Big() {
		// TODO Auto-generated method stub
			int ar[] = {-6,-70,-10,-8}; 
			int big = Integer.MIN_VALUE;
			int sbig = Integer.MIN_VALUE;
			for(int i=0; i<ar.length;i++)
			{
			if(ar[i]>big)
				{
				sbig = big;
				big = ar[i]; 
				}
			else if(ar[i]>sbig)
				{
				sbig = ar[i];
				}
			}
			System.out.println("Biggest is "+ big);
			System.out.println("Second Biggest is "+ sbig);

		}

	private void store_reverse(char[] name) {
		// TODO Auto-generated method stub
		char[] name2 = new char[name.length]; 
		int i=0, j= name.length-1; 
		while(i<name.length)
		{
		name2[i] = name[j];  
		i++;
		j--; 
		}
		for(i=0; i<name2.length;i++)
		{
			System.out.print(name2[i]);
		}
		
	}

	private void find_smallest(int[] ar) {
		// TODO Auto-generated method stub
		int small = Integer.MAX_VALUE; 
		
		
		for(int i=0; i<ar.length; i++)
		{
		if(ar[i]<small)
			small = ar[i];
		}
		System.out.println("Smallest is " + small);  
		
		
	}

	private void find_biggest(int[] ar) {
		// TODO Auto-generated method stub
		
		int big = Integer.MIN_VALUE; 
		for(int i=0; i<ar.length; i++)
		{
		if(ar[i]>big)
			big = ar[i];
		}
		System.out.println("Biggest is " + big);  
		
	}

	private void replace_center(char c, char[] name) {
		// TODO Auto-generated method stub
		int len = name.length; 
		name[len/2] = c; 
		for(int i=0; i<name.length;i++)
		{
			System.out.print(name[i]+" ");
		}
		
		
	}

	private void replace(char c, char[] name) {
		// TODO Auto-generated method stub
		int len = name.length;
		name[len-1] = c; 
		for(int i=0; i<name.length;i++)
		{
			System.out.print(name[i]+" ");
		}
		
	}

	private void last_occurrence(char[] name) {
		// TODO Auto-generated method stub
		char ch = 'y'; 
		for(int i=name.length-1; i>=0;i--)
		{
			if(name[i] == ch)
			{
				System.out.println("Yes, present at position: "+ i);
				break;
			}
		}
		
	}

	private void count_of_given_char(char[] name) {
		// TODO Auto-generated method stub
		char ch = 'y'; 
		int count = 0; 
		for(int i=0; i<name.length;i++)
		{
			if(name[i] == ch)
			{
				System.out.println("Yes, present at position: "+ i);
				count++;
				
			}
		}
		System.out.println("No. of times "+ ch + " occurred is "+ count);
		
	}

	private void find_given_char(char[] name) {
		// TODO Auto-generated method stub
		char ch = 'y'; 
		for(int i=0; i<name.length;i++)
		{
			if(name[i] == 'y')
			{
				System.out.println("Yes, present at position: "+ i);
				
			}
		}
		
	}

	private void linear_search(char[] name) {
		// Linear Search
		char ch = 'y'; 
		for(int i=0; i<name.length;i++)
		{
			if(name[i] == ch)
			{
				System.out.println("Yes, present at position: "+ i);
				break;
			}
		}
		
		
	}

	private void print_reverse(char[] nnn) {
		// TODO Auto-generated method stub
		int len = nnn.length; 
		for(int i=len-1; i>=0;i--) {
			System.out.print(nnn[i]+" ");
		}
		
	}

	private void getValues() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length: ");
		int len = sc.nextInt(); 
		int[] marks = new int[len];  
		int total = 0; 
		for(int i=0; i<marks.length; i++)
		{
			System.out.println("Enter Marks: ");
			marks[i] = sc.nextInt(); 
			total = total + marks[i]; 
			
		}
		System.out.println("Total is "+ total);
		System.out.println("Percentage is "+ total/len);

	}

} 

