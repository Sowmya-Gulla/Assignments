
public class A8_Q1 {

	public static void main(String[] args) {
		ArithmeticOperations mylambda=(int a, int b)->a+b;
		ArithmeticOperations mylambda1=(int a, int b)->a-b;
		ArithmeticOperations mylambda2=(int a, int b)->a*b;
		ArithmeticOperations mylambda3=(int a, int b)->{
			if(b==0)
				return 0;
			return a/b;
		};
		System.out.println(mylambda.implement(10, 20));
		System.out.println(mylambda1.implement(10, 20));
		System.out.println(mylambda2.implement(10, 20));
		System.out.println(mylambda3.implement(10, 20));
		
		}
}

@FunctionalInterface
interface ArithmeticOperations{
	int implement(int a,int b);
}