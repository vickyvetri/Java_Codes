public class Child2 extends Parent
{

public static void main(String[] args)
{
Parent parent = new Child2(); 
parent.grow(); 
parent.study(); 
parent.get_GoodJob(); 
//parent.do_java_programs();
Child2 child = new Child2(); 
child.do_java_programs(); 
child.get_GoodJob(); 
child.grow(); 
child.study();
}

void do_java_programs()
{
System.out.println("Java Programs"); 
}
void get_GoodJob()
{
System.out.println("Yes, On the way"); 

}
} 
