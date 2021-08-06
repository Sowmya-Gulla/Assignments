
public class A2_Q2 {
	public static void main(String args[]) {
		employee ob=new manager();
		double sal1=ob.totalsalary();
		employee ob2=new labour();
		double sal2=ob2.totalsalary();
		System.out.println(sal1+sal2);
		
	}

}
class employee{
	double salary=1000;
	public double totalsalary() {
		return salary;
	}
	
}
class manager extends employee{
	public double totalsalary() {
		double incentives = 500;
		return salary+incentives;
	}
	
}
class labour extends employee{
	public double totalsalary() {
		double overtime=100;
		return salary+overtime;
	}
	
}