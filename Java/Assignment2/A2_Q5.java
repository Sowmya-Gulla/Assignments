
public class A2_Q5 {

	public static void main(String[] args) {
		shape o=new line();
		shape o1=new rectangle();
		shape o2=new cube();
		o.draw();
		o1.draw();
		o2.draw();
	}

}
 abstract class shape{
	abstract void draw();
	
}
class line extends shape{
	void draw() {
		System.out.println("Line");
			
		}	
}
class rectangle extends shape{
	void draw() {
		System.out.println("Rectangle");
		
	}
	
}
class cube extends shape{
	void draw() {
		System.out.print("Cube");
		
	}
	
}