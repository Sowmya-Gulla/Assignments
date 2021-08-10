import java.util.*;
public class A6_Q2 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		System.out.println("ArrayList Elements : "+a);
		
		HashSet<Integer> h=new HashSet<>(a);
		System.out.println("HashSet Elements : "+h);
				
		
			
	}

}
