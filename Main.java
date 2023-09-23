class A2B
{

void tiffen()
{
System.out.println("Idly & Sambar");
}

void lunch()
{
System.out.println("Meals");
}

void juice()
{
System.out.println("Apple Juice");
}

}
class A2BIndia extends A2B
{
double  price(double rate)
{
System.out.println("INR  -->"+rate);
return rate;
}
}

class A2BUSA extends A2B
{
double price(double rate)
{
System.out.println("USD -->"+rate);
return rate;
}
}

public class Main
{
public static void main(String args[])
{

A2BIndia a2bindia=new A2BIndia();
a2bindia.lunch();
a2bindia.price(38.0);


A2BUSA a2busa=new A2BUSA();
a2busa.lunch();
a2busa.price(2.0);


}
}
