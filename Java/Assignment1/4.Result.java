import java.util.*;
public class Result {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3;
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		if(n1>60 && n2>60 && n3>60) {
			System.out.println("Passed");
		}
		else if(n1>60 && n2>60 || n2>60 && n3>60 || n1>60 && n3>60) {
			System.out.println("Promoted");
			
		}
		else {
			System.out.println("Failed");
		}
		

	}

}
