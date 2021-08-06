import java.util.*;
public class TotalScore {

	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		Scanner sc=new Scanner(System.in);
		int i=0,j=0;
		float total=0,avg=0;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				total+=arr[i][j];
			}
			System.out.println("Total score:"+total);
			System.out.println("Average score:"+total/3);
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				total+=arr[j][i];
			}
			System.out.println("Total score in all Subjects:"+total);
			System.out.println("Average score in all subjects:"+total/3);
		}
		
		

	}

}
