package Task;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime obj = new Prime();
		obj.Print(60);
	}
public void Print(int no) {
	int div = 1;
	while(div<=no) { 
		if(no%div==0) {
			System.out.print(div+" ");
		}
		div++;
	}
}
}
