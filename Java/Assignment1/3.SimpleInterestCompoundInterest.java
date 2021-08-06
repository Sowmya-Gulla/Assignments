
import java.util .*;
class SimpleInterestCompoundInterest
{
    public static void main (String argu[ ])
{
    double principle, rate, time, simple,compound;
    Scanner sc=new Scanner (System. in);
    System.out.println("Principle:");
    principle=sc.nextDouble();
    System. out. println("Time:");
    time=sc.nextDouble();
    System. out. println("Rate:");
    rate=sc.nextDouble();
    simple=(principle * time * rate)/100;
    compound=principle * Math.pow(1.0+rate/100.0,time) - principle;
    System.out.println("Simple Interest="+simple);
    System.out. println("Compound Interest="+compound);
   }
}
