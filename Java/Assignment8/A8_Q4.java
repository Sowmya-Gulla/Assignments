
import java.util.ArrayList;
import java.util.List;
public class A8_Q4 {

	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("Apple");
		l.add("Grapes");
		l.add("Mango");
		l.add("Orange");
		System.out.println(l);
		l.removeIf(a->((a.length())%2!=0));
		System.out.println(l);
	}
}
