import java.util.*;
public class A4_Q1 {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			int firstnum,secoundnum;
			System.out.println("Enter First Num : ");
			firstnum=s.nextInt();
			System.out.println("Enter Secound Num : ");
			secoundnum=s.nextInt();
			System.out.println("Result is : " +firstnum/secoundnum);
		}
		catch(ArithmeticException ae){
			System.out.println("Cannot divide by 0");
		}

	}

}
