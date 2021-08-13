import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


class orders{
	int ID;
	int price;
	String Status;
	public orders(int iD, int price, String status) {
		super();
		ID = iD;
		this.price = price;
		Status = status;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
}
public class A8_Q2 {

	public static void main(String[] args) {
		List<orders> list=new ArrayList<>();
		list.add(new orders(1,30000,"ACCEPTED"));
		list.add(new orders(2,6000,"COMPLETED"));
		list.add(new orders(3,21000,"COMPLETED"));
		list.add(new orders(4,9000,"ACCEPTED"));
	
		System.out.println("Oders having price greater than 10000");
		list.stream().filter(p -> p.price > 10000).forEach(
				order->System.out.println(order.ID+" "+order.price+" "+order.Status)
				);
		
		System.out.println("\nOders having status ACCEPTED");
		list.stream().filter(p->p.getStatus().matches("ACCEPTED")).forEach(
				order->System.out.println(order.ID+" "+order.price+" "+order.Status)
				);
		
		System.out.println("\nOders having status COMPLETED");
		list.stream().filter(p->p.getStatus().matches("COMPLETED")).forEach(
				order->System.out.println(order.ID+" "+order.price+" "+order.Status)
				);
	}

}