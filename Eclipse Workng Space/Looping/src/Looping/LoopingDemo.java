package Looping;

public class LoopingDemo {
	
	int prime_count =0; 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoopingDemo ld = new LoopingDemo(); 
//		ld.print1_5times(); 
//		ld.print12345(); 
//		ld.print13579(); 
//		ld.print246810();
//		ld.print3691215(); 
//		ld.print_multiples_3_5(); 
//		ld.print_multiples_3_or_5(); 
//		ld.print_addition_of_n_numbers(); 
//		ld.print_multiplication_of_n_numbers(); 
//		ld.print_divisors(); 
//		ld.print_count_of_divisors();
//		ld.print_twenty_prime_nos();
		int no = 5; 
		while(no>=1)
		{
		//ld.find_fact(no); 
		no = no-1; 
		}
		//ld.print_Multiples(); 
		//ld.print_power(); 
		//ld.print_1_11_121();
		//ld.print_1_8_27_64(); 
		//int power = ld.find_power(10,3); 
		//System.out.println(power);
		int val=1; 
		while(val<=4)
		{
		int result = ld.find_power(val, val); 
		System.out.print(result+" ");
		val=val+1; 
		}
		}

	private int find_power(int base, int power) {
		int box = 1; 
		while(power>0)
		{
		box = box*base; //1000
		power = power-1;//1
		}
		return box; 		
	}

	private void print_1_8_27_64() {
		// TODO Auto-generated method stub
		int no = 1; 
		while(no<=4)
		{
		System.out.print((no*no*no) + " "); 
		no = no+1; 
		}
		
	}

	private void print_1_11_121() {
		// TODO Auto-generated method stub
		//Printing 1 11 121
		int no = 1; 
		while(no<=121)
		{
		System.out.print(no+" "); 
		no = no*11; 
		}
		
	}

	private void print_power() {
		// TODO Auto-generated method stub
		//Printing 1 4 9 16 25 36 49 64 81 100

		int no= 1; 
		while(no<=10)
		{
		System.out.print((no*no) + " ");
		no = no+1; 
		}
		
	}

	private void print_Multiples() {
		// TODO Auto-generated method stub
		int no1 = 1, no2 = 10; 
		while(no1<=5)
		{
		System.out.println(no1 + " * " + no2 + " = " + (no1*no2)); 
		no1 = no1+1; no2 = no2-1; 
		}

		
	}

	private void find_fact(int no) {
		int fact = 1; 
		int start = 1; 
		while(start<=no)
		{
		fact = fact * start; 
		start = start+1; 
		}
		System.out.println("Factorial of " + no +" is " + fact); 
		no = no-1; 
		
	}

	private void print_twenty_prime_nos() {
		// TODO Auto-generated method stub
		int no = 2; 

		int prime_no_count = prime_number(no); 
		while(prime_no_count<20) //2<20
		{
			no = no+1; //5
			prime_no_count  = prime_number(no);//2
		}

		//System.out.println("Prime Numbers count "+ prime_count);
	
		
	}

	private int prime_number(int no) {
		int div = 2; 
		int count = 0; 
		while(div<=no/2) /// 500
		{
		if(no%div==0) {
			//System.out.print(div+" "); 
			count = count+1; 
			//System.out.println(no + " is Not Prime"); 
			break; // breaks the loop
		}
		div = div+1; 
		}
		if(count==0)
		{
			System.out.println(no + " is Prime Number");
			prime_count = prime_count + 1; //2
		}
		return prime_count; 
		
	}

	private void print_count_of_divisors() {
		// TODO Auto-generated method stub
		int no = 100, div = 2; 
		int count = 0; 
		while(div<=no/2)//299
		{
		if(no%div==0) {
			//System.out.print(div+" "); 
			count = count+1; 
		}
		div = div+1; 
		}
		System.out.println("No. of divisors is "+ count);
	}

	private void print_divisors() {
		// TODO Auto-generated method stub
		int no = 100, div = 2; 
		while(div<=no/2)//299
		{
		if(no%div==0)
			System.out.print(div+" "); 
		div = div+1; 
		}
		
	}

	private void print_multiplication_of_n_numbers() {
		int fact = 1; 
		int no = 1; 
		while(no<=4)
		{
		fact = fact * no; 
		no = no+1; 
		}
		System.out.println("Factorial is " + fact); 
	}

	private void print_addition_of_n_numbers() {
		// TODO Auto-generated method stub
		int purse = 0; 
		int amt = 1; 
		while(amt<=10)
		{
		purse = purse + amt; 
		System.out.println("Total amount is " + purse); 
		amt = amt+1; 
		}
		//System.out.println("Total amount is " + purse); 
		
	}

	private void print_multiples_3_or_5() {
		// TODO Auto-generated method stub
		int no = 1; 
		while(no<=50)
		{
		if(no%3==0 || no%5==0){
		System.out.print(no+" ");
		} 
		no = no+1; 
		}
		
		
	}

	private void print_multiples_3_5() {
		// TODO Auto-generated method stub
		int no = 1; 
		while(no<=50)
		{
		if(no%3==0 && no%5==0){
		System.out.print(no+" ");
		} 
		no = no+1; 
		}
		
	}

	private void print3691215() {
		// TODO Auto-generated method stub
		int no = 3; 
		while(no<=15)
		{
		System.out.print(no+" "); 
		no = no+3; 
		}
		
	}

	private void print246810() {
		// TODO Auto-generated method stub
		int no = 2; 
		while(no<=10){
		System.out.print(no+" "); 
		no=no+2; 
		}
		
	}

	private void print13579() {
		// TODO Auto-generated method stub
		int no = 1; 
		while(no<=9)
		{
		System.out.print(no +" "); 
		no = no+2; 
		}
	}

	private void print12345() {
		// TODO Auto-generated method stub
		int no = 1; 
		while(no<=5)
		{
		System.out.print(no+" ");
		no = no+1;
		}
		
	}

	private void print1_5times() {
		// TODO Auto-generated method stub
		int count = 1; 
		while(count<=5)
		{
		System.out.print(1+" "); 
		count = count+1; 
		}
		
	}

}