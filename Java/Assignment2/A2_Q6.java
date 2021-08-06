
public class A2_Q6 {

	public static void main(String[] args) {
		persistence ob1=new filePersistence();
		persistence ob2=new databasePersistence();
		ob1.persist();
		ob2.persist();
		

	}

}
abstract class persistence{
	abstract void persist();
	
}
class filePersistence extends persistence{
	void persist() {
		System.out.println("Data in File");		
	}
	
}
class databasePersistence extends persistence{
	void persist() {
		System.out.println("Data in Database");
		
	}
	
}
