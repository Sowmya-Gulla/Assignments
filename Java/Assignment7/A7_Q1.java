
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test{
	String value() default "test";
}

class TestCases{
	@Test(value="testcases")
	public void test1() {
		System.out.println("Test Cases ");
	}
}
public class A7_Q1 {

	public static void main(String[] args) throws Exception {
		TestCases obj=new TestCases();
		Method anno=obj.getClass().getMethod("test1");
		Test t1=anno.getAnnotation(Test.class);
		System.out.println(t1.value());		

	}

}