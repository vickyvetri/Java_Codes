package Cuddalore; 
class Son extends Selvaraj
{ 

int salary = 25000; 
int age = 35;
public static void main(String[] args)
{
Son son = new Son(); 
son.walking();
son.doYoga(); 
System.out.println(son.salary); 
System.out.println(son.age); 
}
public void walking()
{
System.out.println("Walking in 5-KMS"); 
}
public void doBusiness()
{
System.out.println("Doing Business"); 
}
} 
