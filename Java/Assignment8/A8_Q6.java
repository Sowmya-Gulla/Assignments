import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class A8_Q6 {

	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("Sowmya");
		l.add("Satya");
		l.add("Karthik");
		l.add("Sunitha");
		
		
		System.out.println(l);
		
		l.replaceAll(new UppercaseOperation());
		
		System.out.println(l);

	}

}
class UppercaseOperation implements UnaryOperator<String>{

	@Override
	public String apply(String s) {
		
		return s.toUpperCase();
	}
	
}