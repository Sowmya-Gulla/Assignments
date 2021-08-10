
public class A2_Q1 {

	public static void main(String[] args) {
		sample obj=sample.getInstance();
	}

}
class sample{
	static sample obj=new sample();
	private sample() {
		
	}
	public static sample getInstance() {
		return obj;
	}
	
}
class s1 extends sample{
	
}