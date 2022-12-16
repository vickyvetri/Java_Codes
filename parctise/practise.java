class practise
{
public static void main(String[] args){
int n = 2;
int count = 0;
int div = 32;
while(n<=div/2){
if(div%n==0){
System.out.println("Not a Pirme Number");
count++;
}
n++;
}
//System.out.println("Count of Divisors of "+div+" is "+count);
if(count==0){System.out.println("Prime Number");}
}
}
