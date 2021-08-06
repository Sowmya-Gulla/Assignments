import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[15];
		int i=0,j=0,temp=0;
		for(i=0;i<15;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<14;i++)
		{
			for(j=0;j<14;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		for(i=0;i<15;i++)
		{
			System.out.print(arr[i] +" ");
			
		}
		

	}

}
