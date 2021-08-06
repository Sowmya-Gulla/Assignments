import java.util.*;
public class IncomeTax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double income,tax=0;
		income=sc.nextDouble();
		if(income>0 && income<=180000) {
			tax=0;
		}
		else if(income>=181001 && income<=300000) {
			tax=0.1*income;
		}
		else if(income>=300001 && income<=500000) {
			tax=0.2*income;
		}
		else if(income>=500001 && income<=1000000) {
			tax=0.3*income;
		}
		System.out.println("Tax Amount:"+tax);
		
		

	}

}
