import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute{

	int Sequence();
	
}
class MyClass{
	@Execute(Sequence=2)
	public void myMethod1() {
		System.out.println("Method1");
		
	}
	@Execute(Sequence=1)
	public void myMethod2() {
		System.out.println("Method2");
		
	}
	@Execute(Sequence=3)
	public void myMethod3() {
		System.out.println("Method3");
		
	}
}
public class A7_Q3 {

	public static void main(String[] args) throws Exception {
		MyClass obj=new MyClass();
		Method[] m=obj.getClass().getMethods();
		for(Method method:m) {
			Execute e=method.getAnnotation(Execute.class);
			if(e!=null) {
				System.out.println("Sequence:"+e.Sequence());
				method.invoke(obj);	
										
			}
				
		}
	
	}

}
