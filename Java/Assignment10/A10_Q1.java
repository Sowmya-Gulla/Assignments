
public class A10_Q1 {

	public static void main(String[] args) {
		
		Interest i=(p,r,t) -> {
			return p+(p*r*t)/100;
		};
		System.out.println("Simple interest :"+i.si(20000, 2, 5));
		
	}

}

@FunctionalInterface
interface Interest{
	int si(int p, int r,int t);
}