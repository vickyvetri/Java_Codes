package tamilnadu.chennai;

public class LoopingBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopingBasics lb = new LoopingBasics(); 
		//lb.father_kid_problem(5); 
		//lb.find_common_divisors(100, 300);
		//lb.find_gcd(10000,2500); 
		//lb.find_lcm(3, 10);
		//lb.find_sqr_root(81,2); 
		//lb.swap_two_nos(10,15); 
		//lb.print_reverse(123456); 
		//int count = lb.count_of_digits(6767); 
		//System.out.println(count);
		//int sum_of_digits = lb.find_sum_of_digits(65678); 
		//if(sum_of_digits>9)
		{
		//	System.out.println(
		//	lb.find_sum_of_digits(sum_of_digits)); 	
		}
		//lb.reverse_number(98765); 
		//lb.find_palindrome(9889); 
		//lb.find_armstrong_or_not(153);
		lb.swap_without_third(123, 456);

	}

	private void swap_without_third(int no1, int no2) {
		// TODO Auto-generated method stub

//		System.out.println(no1); 
//		System.out.println(no2); 

		no1 = no1 + no2; 	// no1 = 120
		no2 = no1 - no2; 	// no2 = 100
		no1 = no1 - no2; 	// no1 = 20
		
		System.out.println(no1); 
		System.out.println(no2); 
		
	}

	private void find_armstrong_or_not(int no) {
		// TODO Auto-generated method stub
		int no2 = no; 
		int armstrong = 0; 
		while(no>0) {
		int rem = no%10;
		armstrong = armstrong + (rem*rem*rem); 
		no = no/10; 
		}
		//System.out.println(reverse);
		//System.out.println(no);
		if(no2==armstrong)
			System.out.println("Armstrong");
		else
			System.out.println("not Armstrong");

		
	}

	private void find_palindrome(int no) {
		// TODO Auto-generated method stub
		int no2 = no; 
		int reverse = 0; 
		while(no>0) {
		int rem = no%10;
		reverse = (reverse*10) + rem; 
		no = no/10; 
		}
		//System.out.println(reverse);
		//System.out.println(no);
		if(no2==reverse)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}

	private void reverse_number(int no) {
		// TODO Auto-generated method stub
		int reverse = 0; 
		while(no>0) {
		int rem = no%10;
		reverse = (reverse*10) + rem; 
		no = no/10; 
		}
		System.out.println(reverse);
	}

	private int find_sum_of_digits(int no) {
		// TODO Auto-generated method stub
		int sum = 0; 
		while(no>0)
		{
			int rem = no%10; 
			sum = rem + sum; 
			no = no/10;
		}
		return sum; 
		
		
	}

	private int count_of_digits(int no) {
		// TODO Auto-generated method stub
		int count =0; 
		while(no>0)
		{
			count = count+1;
			no = no/10;
		}
		return count; 
		
	}

	private void print_reverse(int no) {
		// TODO Auto-generated method stub
		while(no>0)
		{
		System.out.println(no%10);
		no = no/10;
		}
		
		
	}

	private void swap_two_nos(int no1, int no2) {
		// TODO Auto-generated method stub
		System.out.println(no1); //10
		System.out.println(no2); //20


		//no1 = no2; //no1 = 20
		//no2 = no1; //no2 = 20

		int temp = no1; //temp = 10
		no1 = no2; //no1 = 20
		no2 = temp; 

		System.out.println(no1); //20
		System.out.println(no2); //10

		
	}

	private void find_sqr_root(int m, int n) {
		// TODO Auto-generated method stub
		while(n<=m/2)
		{
		if(m/n ==n) {
		  System.out.println(n); 
		  break;
		}
		n = n+1;
		}
		
	}

	private void find_lcm(int no1, int no2) {
		// TODO Auto-generated method stub
		int big = no1>no2? no1: no2; //10

		while(true){

		if(big%no1 ==0 && big%no2==0)
		{
		System.out.println("Least Common Multiple is "+ big);
		break;  
		}
		big = big+1; 
		}
		
	}

	private void find_gcd(int no1, int no2) {
		// TODO Auto-generated method stub
		int div = 2; 
		int gcd = 0; 
		int small = no1<no2? no1:no2; // Ternary Operator
		while(div<=small)
		{
		if(no1%div==0 && no2%div==0)
		{
		//System.out.print(div + " "); 
		gcd = div; 
		}
		div= div+1; 
		}
		System.out.println("Greatest Common Divisor is "+ gcd);
		
	}

	private void find_common_divisors(int no1, int no2) {
		// TODO Auto-generated method stub
		
		int div = 2; 
		int small = no1<no2? no1:no2; // Ternary Operator
		while(div<=small)
		{
		if(no1%div==0 && no2%div==0)
		{
		System.out.print(div + " "); 
		}
		div= div+1; 
		}
		
	}

	private void father_kid_problem(int amt) {
		// TODO Auto-generated method stub
		int purse = 0; 
		int day = 1; 
		while(day<=5)
		{
		purse = purse + amt; 
		day = day+1; 
		}
		System.out.println(purse); 
		String s = "123"; 
		
		
	}

}
