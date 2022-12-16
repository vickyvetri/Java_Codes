class Child extends Parent
{
Child()
{
System.out.println("Child Constructor ");
}
Child(int no)
{
super(no); // new Parent(no); 
System.out.println("Child Single Args Constructor ");
} 
public static void main(String[] args)
{
//Parent parent = new Parent(); 
//parent.get_GoodJob(); 

Child child = new Child(); 
Child child2 = new Child(10);
child.get_GoodJob(); 
child.grow(); 
child.study(); 
}
void get_GoodJob()
{
System.out.println("On the way ");
}
void study(){
//super.study(); 
System.out.println("Studying Abroad"); 
	} 
} 
