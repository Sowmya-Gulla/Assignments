import java.util.*;
import java.io.*;
public class A6_Q3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Choose a option :");
		System.out.println("a) ID \nb) Name \nc) Department \nd) Salary");
		String c=s.next();
		if(c.equals("a")) {
			Set<Employee> set=new TreeSet<Employee>(new IDComparator());
			set.add(new Employee(1,"Jerry","Analyst",300000));
			set.add(new Employee(2,"Tom","Senior Analyst",500000));
			for(Employee n:set) {
				System.out.println(n);
			}			
		}
		else if(c.equals("b")) {
			Set<Employee> set1=new TreeSet<Employee>(new NameComparator());
			set1.add(new Employee(1,"Jerry","Analyst",300000));
			set1.add(new Employee(2,"Tom","Senior Analyst",500000));
			for(Employee n:set1) {
				System.out.println(n);
			}			
		}
		else if(c.equals("c")) {
			Set<Employee> set2=new TreeSet<Employee>(new DepartmentComparator());
			set2.add(new Employee(1,"Jerry","Analyst",300000));
			set2.add(new Employee(2,"Tom","Senior Analyst",500000));
			for(Employee n:set2) {
				System.out.println(n);
			}			
		}
		else if(c.equals("d")) {
			Set<Employee> set3=new TreeSet<Employee>(new SalaryComparator());
			set3.add(new Employee(1,"Jerry","Analyst",300000));
			set3.add(new Employee(2,"Tom","Senior Analyst",500000));
			for(Employee n:set3) {
				System.out.println(n);
			}			
		}
	}
}
class IDComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.ID>e2.ID) {
			return -1;
		}
		else if(e1.ID<e2.ID) {
			return 1;
		}
		else {
			//return (e1.ID).compareTo(e2.ID);
			return Integer.compare(e1.ID, e2.ID);
		}
	}
}
class NameComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return (e1.name).compareTo(e2.name);
	}
}
class DepartmentComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return (e1.department).compareTo(e2.department);
	}
}
class SalaryComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.salary>e2.salary) {
			return -1;
		}
		else if(e1.salary<e2.salary) {
			return 1;
		}
		else {
			//return (e1.ID).compareTo(e2.ID);
			return Double.compare(e1.salary, e2.salary);
		}
	}
}
class Employee{
	int ID;
	String name,department;
	double salary;
	Employee(int ID,String name,String department,double salary){
		this.ID=ID;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return this.ID+" "+this.name+" "+this.department+" "+this.salary;
	}
	
}

