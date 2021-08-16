import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Trader{
	String name;
	String city;
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}
	
}
public class A9_Q9_10_11_12 {

	public static void main(String[] args) {
		Trader t1=new Trader("Sowmya","Hyd");
		Trader t2=new Trader("Satya","Pune");
		Trader t3=new Trader("Karthik","Pune");
		Trader t4=new Trader("Mahi","Bangalore");
		Trader t5=new Trader("Vamsi","Indore");
		Trader t6=new Trader("Chandu","Indore");
		
		List<Trader> trader=new ArrayList<>();
		trader.add(t1);
		trader.add(t2);
		trader.add(t3);
		trader.add(t4);
		trader.add(t5);
		trader.add(t6);
		
		//Q9
		System.out.println("Unique city:");
		trader.stream().filter(DistinctCustomPropertyExample.distinctByKey(i -> i.getCity())).forEach(System.out::println);
		
		//Q10
		System.out.println("\nTrader from pune:");
		trader.stream().filter(i -> i.city=="Pune").sorted(Comparator.comparing(Trader::getName)).forEach(System.out::println);
		
		//Q11
		System.out.println("\nSorted traders name:");
		trader.stream().sorted(Comparator.comparing(Trader::getName)).forEach(P ->System.out.println(P.name));
		
		//Q12
		System.out.println("\nTraders from indore:");
		trader.stream().filter(i -> i.city=="Indore").forEach(System.out::println);

	}

}

class DistinctCustomPropertyExample{
	public static <T> Predicate<T> distinctByKey(Function<? super T,Object> keyExtractor){
   	 Map<Object, Boolean> uniqueMap = new ConcurrentHashMap<>();
   	 return t -> uniqueMap.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
	
}