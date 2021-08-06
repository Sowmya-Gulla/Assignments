
public class Armstrong
{
    public static void main(String args[])
    {
        int sum, num1=101, num2=999, i, rem, temp;
        for(i=num1; i<num2; i++)
        {
            temp = i;
            sum = 0;
            while(temp != 0)
            {
                rem = temp%10;
                sum = sum + rem*rem*rem;
                temp = temp/10;
            }
            if(i == sum)
            {
            	
                System.out.print(i + "  ");
            }
        }
      
    }
}
