import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class A8_Q5 {
	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("Sowmya");
		l.add("Karthik");
		l.add("Vamsi");
		l.add("Satya");
		StringBuffer buf=new StringBuffer();
		Consumer<List<String>> c=list->{
			Iterator<String> it=list.iterator();
			while(it.hasNext()) {
				String s=it.next();
				buf.append(s.charAt(0));
			}
		};
		
		c.accept(l);
		System.out.println(buf);
	}
}
