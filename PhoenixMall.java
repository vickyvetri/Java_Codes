class PhoenixMall
{
// Fields - Global Variables
static String address = "velachery"; // Common for all Objects
String movie_name; //non-static
int movie_time; //non-static - Instance specific,
// Object Specific
boolean subtitle;
PhoenixMall(String s1, int i, boolean b)
{

}
public static void main(String[] args)
{
PhoenixMall screen1 = new PhoenixMall("PS1", 10, true);
//screen1.movie_name = "PS1";
//screen1.movie_time = 10;
//screen1.subtitle= true;
PhoenixMall screen2 = new PhoenixMall("Prince", 11, false);

PhoenixMall screen3 = new PhoenixMall("Sardar", 1130, false);

System.out.println(screen1.movie_name);
System.out.println(PhoenixMall.address);
System.out.println(address);

}

}
