import java.util.*;
public class A5_Q1 {

	public static void main(String[] args) {
		HashSet<Employee> h=new HashSet<>();
		Employee e1=new Employee(101,"Jessie","Analyst",400000);
		Employee e2=new Employee(103,"John","Analyst",500000);
		h.add(e1);
		h.add(e2);
		System.out.println("Employee Details");
		for(Employee e:h) {
			
			e.displayDetails();
		}
	}

}
class Employee{
	int id;
	String name,department;
	double salary;
	Employee(int id,String name,String department,double salary){
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	
	void displayDetails() {
		System.out.println(this.id+" "+this.name+" "+this.department+" "+this.salary);
		
		
	}
}