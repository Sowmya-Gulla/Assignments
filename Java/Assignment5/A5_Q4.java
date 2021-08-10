import java.util.*;
public class A5_Q4 {

	public static void main(String[] args) {
		Pair<String,String> p=new Pair<>();
		p.setKey("1");
		p.setValue("Apple");
		System.out.println("Key-"+p.getKey()+" "+"Value-"+p.getValue());
		
		Pair<String,java.util.Date> p1=new Pair<>();
		p1.setKey("Today's Date is");
		p1.setValue(new java.util.Date());
		System.out.println(p1.getKey()+" "+p1.getValue());	
	}

}
class Pair<K,V>{
	K key;
	V value;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}

	
	
}