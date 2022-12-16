package chennai;
public class office
{
public static void main(String[] args)
{
Office engineer = new Office();
engineer.develop();
engineer.test();
}
protected void develop()
{
System.out.println("Development");
}
protected void test()
{
System.out.println("Testing");
}

}
