import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class A8_Q8 extends Thread { 
	public static void main(String[] args) {
		A8_Q8 t=new A8_Q8();
		t.start();
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		Consumer<List<Integer>> print=list -> list.stream().forEach(a -> System.out.print(a + " "));
		  
		print.accept(l);
	}
}
class Thread{
	void start() {
		System.out.println("Thread Running");
	}
	
}