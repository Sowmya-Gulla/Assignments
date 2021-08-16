import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Transcation{
	Trader trader;
	int year;
	int value;
	public Transcation(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transcation [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
	
}
public class A9_Q8_13_14_15 {
	
	public static void main(String[] args) {
		
		Trader t1=new Trader("Sowmya","Delhi");
		Trader t2=new Trader("Satya","Pune");
		Trader t3=new Trader("Karthik","Pune");
		Trader t4=new Trader("Mahi","Bangalore");
		Trader t5=new Trader("Vamsi","Indore");
		Trader t6=new Trader("Chandu","Indore");
		
		
		Transcation T1=new Transcation(t1,2011,5000);
		Transcation T2=new Transcation(t2,2010,15000);
		Transcation T3=new Transcation(t3,2012,50000);
		Transcation T4=new Transcation(t4,2011,25000);
		Transcation T5=new Transcation(t5,2015,55000);
		Transcation T6=new Transcation(t6,2011,35000);
		
		List<Transcation> trans=new ArrayList<>();
		trans.add(T1);
		trans.add(T2);
		trans.add(T3);
		trans.add(T4);
		trans.add(T5);
		trans.add(T6);
		
		//Q8
		System.out.println("Transaction in year 2011:");
		trans.stream().filter(P -> P.year==2011).sorted(Comparator.comparing(Transcation::getValue)).forEach(System.out::println);
		
		//Q14
		System.out.println("\nHighest Transaction:");
		Transcation high=trans.stream().max(Comparator.comparing(Transcation::getValue)).get();
		System.out.println(high);
		
		//Q15
		System.out.println("\nLowest Transaction:");
		Transcation low=trans.stream().min(Comparator.comparing(Transcation::getValue)).get();
		System.out.println(low);
		
		//Q13
		System.out.println("\nTransaction of traders from delhi:");
		trans.stream().filter(P -> P.trader.getCity().equals("Delhi")).forEach(System.out::println);
	}

}