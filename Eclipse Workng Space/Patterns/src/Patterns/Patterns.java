package Patterns;

public class Patterns {

	public static void main(String[]  args) {
		// TODO Auto-generated method stub
		Patterns obj = new Patterns();
//		obj.pattern_1();
//		obj.pattern_4();
//		obj.pattern_3();
//		obj.pattern_2();
		obj.Upper_Case("vicky1234");
	}

	private void Upper_Case(String name) {
		// TODO Auto-generated method stub
//		name = name.toUpperCase();
//		System.out.println(name);
		for(int i=0;i<name.length();i++)
		{
		char ch = name.charAt(i);
//System.out.print(ch);
		if(ch>='a' && ch<='z') {
		if(i%2==0)
		System.out.print((char)(ch-32));
		else
			System.out.print(ch);
		}
		else
		{
			System.out.print(ch);
		}} 
	}

	private void pattern_4() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=5-row;col>0;col--) {
				System.out.print("  ");
			}
			for(int s=1;s<=row;s++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void pattern_3() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=5-row;col>0;col--) {
				System.out.print("  ");
			}
			for(int s=1;s<=row;s++) {
				System.out.print("*   ");
			}
			System.out.println();
		}
	}

	private void pattern_2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

	private void pattern_1() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
