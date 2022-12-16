abstract class Parent
{
Parent()
{
System.out.println("Parent Constructor"); 
} 
Parent(int no)
{
System.out.println("Parent - Single Args Constructor"); 
} 
abstract void get_GoodJob();

void grow(){	
System.out.println("Organic way"); 
}

void study(){
System.out.println("Children's wish"); 
}
} 
