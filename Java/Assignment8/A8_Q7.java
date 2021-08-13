
import java.util.HashMap;
import java.util.Map;

public class A8_Q7 {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();  
		  map.put(1,"Sowmya");  
		  map.put(2,"Satya");  
		  map.put(3,"Karthik"); 
		  
		  System.out.println(map);
		  
		  StringBuilder buf=new StringBuilder();
		  
		  for(Map.Entry m:map.entrySet()) {
			  
			  buf.append(m.getKey());
			  buf.append(m.getValue());
		  }
		  System.out.println(buf);

	}

}