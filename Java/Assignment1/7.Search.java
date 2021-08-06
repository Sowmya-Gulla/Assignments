import java.util.*;
public class Search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[15];
		int element,i=0;
		for(i=0;i<15;i++)
		{
			arr[i]=sc.nextInt();
		}
		element=sc.nextInt();
		for(i=0;i<15;i++)
		{
			if(arr[i]==element) {
				break;
			}	
		}
		if(arr[i]==element) {
			System.out.println("Element found at position:"+i);
		}
		else {
			System.out.println("Element not found");
		}

	}

}
