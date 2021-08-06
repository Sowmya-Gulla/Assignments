import java.util.*;
public class ArmstrongNumber {
	public static void main(String args[]) {
		int num;
		 Scanner sc = new Scanner(System.in);
		 int n,temp,remainder,sum=0;
		 
		 n=sc.nextInt();
		 temp=n;
		 while(temp!=0)
		 {
			 remainder=temp%10;
		     sum=sum+remainder*remainder*remainder;
		     temp=temp/10;
	     }
		 
		 if(sum==n)
		         System.out.println("Armstrong number");
	     else
		         System.out.println("Not an Armstrong number");
		
		
	}

}
