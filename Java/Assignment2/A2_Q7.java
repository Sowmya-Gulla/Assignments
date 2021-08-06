import java.util.*;
public class A2_Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Your Role:");
		String role=sc.next();
		dessertItem ob1=new candy();
		dessertItem ob2=new cookie();
		dessertItem ob3=new icecream();
		if(role.equals("owner")) {
			System.out.println("Add dessertItems");
			System.out.println("Cost of Candy :" +ob1.getCost() + " dollar");
			System.out.println("Cost of Cookies :" +ob2.getCost() + " euro");
			System.out.println("Cost of Icecream :" +ob3.getCost() + " rupees");
			
		}
		else if(role.equals("customer")) {
			System.out.println("Order Placed");
			String item;
			int num,totalcost=0;
			while(true) {
				System.out.println("Item:");
				item=sc.next();
				System.out.println("Quantity:");
				num=sc.nextInt();
				if(item.equals("candy")) {
					totalcost+=num*60*ob1.getCost();
				}
				else if(item.equals("cookie")) {
					totalcost+=num*70*ob2.getCost();
					
				}
				else if(item.equals("icecream")) {
					totalcost+=num*ob3.getCost();
					
				}
				System.out.println("Is there anything else (y/n):");
				String c=sc.next();
				if(c.equals("y")) {
					continue;
				}
				else {
					break;
				}
				
			}
			System.out.println("Total Cost:"+totalcost);			
		}
		

	}

}
abstract class dessertItem{
	int cost;
	abstract int getCost();
}
class candy extends dessertItem{
	int getCost() {
		cost=2;
		return cost;
		
	}
}
class cookie extends dessertItem{
	int getCost() {
		cost=1;
		return cost;
		
	}
}
class icecream extends dessertItem{
	int getCost() {
		cost=50;
		return cost;
		
	}
}

