package B26;

public class BubbleSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSortDemo	bsd = new BubbleSortDemo();
		//bsd.learn_bubblesort();
		bsd.learn_binary_search();
	}

	private void learn_binary_search() {
		// TODO Auto-generated method stub
		int[] ar = {18,12,11,7,3};
		//   0    1   2  3 4
		int key = 20	;
		int s=0, e=4;
		while(s<=e)
		{
		int mid = (s+e)/2;
		if(ar[mid]==key) //11==12
		{
			System.out.println("Got at position: "+ mid);
			break;
		}
		else if(key>ar[mid]){	
			e = mid-1;		}
		else
		{
			s = mid+1; }
		}
		if(s>e)
		{
			System.out.println("Given key is not present ");
		}
			}
	


	private void learn_bubblesort() {
		// TODO Auto-generated method stub
		
		int[] ar = {10,-7,3,1,8,6,4,12,-19,22,18,5,90};
		System.out.println("Before Sorting: ");
		for(int i=0; i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println("");
		for(int j=1; j<ar.length; j++){
			for(int i=0; i<ar.length-j; i++)
			{
			        if(ar[i]>ar[i+1])
			        {
				        int temp = ar[i];
				        ar[i] = ar[i+1];
				        ar[i+1] = temp; 	}
			        }
			}
		
		System.out.println("After I Sorting: ");
		for(int i=0; i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		int len = ar.length; 
		System.out.println("5th Biggest number is " + ar[len-5]);
		
	}

}
