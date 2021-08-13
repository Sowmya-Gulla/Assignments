import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	int authorid();
	String author();
	String supervisor();
	String date();
	String time();
	int version();
	String description();	
}
@Info(authorid=123,author="John",supervisor="Mary",date="11-08-2021",time="15:10:22",version=8,description="Developer details")
class Developer{
	void show() {
		System.out.println("Developer");
	}
	
}
public class A7_Q2 {

	public static void main(String[] args) {
		Developer obj=new Developer();
		Class c=obj.getClass();
		Annotation a=c.getAnnotation(Info.class);
		Info i=(Info)a;
		System.out.println("AuthorId: "+i.authorid()+"\nAuthor: "+i.author()+"\nSupervisor:"+i.supervisor()+"\nDate:"+i.date()+"\nTime:"+i.time()+"\nVersion:"+i.version()+"\nDescription:"+i.description());
		
	}

}
