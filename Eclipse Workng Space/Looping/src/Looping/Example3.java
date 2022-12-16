package Looping;

public class Example3 {
	 public static void main(String[] args) {
		 Example3 obj = new Example3();
			obj.Print(1);
	}

	private void Print(int a) {
		int i=10;
		while (i>=a){
		System.out.println(i);
		i--;
		}
	}
}
