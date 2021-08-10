import java.util.*;
public class A6_Q1 {

	public static void main(String[] args) {
		Map<Long,Contact> t=new TreeMap<Long,Contact>(Collections.reverseOrder());
		Contact c1=new Contact("Marry","marry@gmail.com","F");
		Contact c2=new Contact("John","John@gmail.com","M");
		t.put(9492285584L,c1);
		t.put(7012562353L,c2);
		System.out.println("Keys :");
		for(Map.Entry m:t.entrySet())  
	      {  
	          System.out.println(m.getKey());      
	      } 
		System.out.println("\nValues :");
		for(Map.Entry<Long, Contact> entry:t.entrySet()){    
	        long key=entry.getKey();  
	        Contact b=entry.getValue();  
	        System.out.println(b.name+" "+b.email+" "+b.gender);   
	    } 
		System.out.println("\nKeys and Value Pairs : ");
		for(Map.Entry<Long, Contact> entry:t.entrySet()){    
	        long key=entry.getKey();  
	        Contact b=entry.getValue();  
	        System.out.println("Phone Number : "+key);  
	        System.out.println(b.name+" "+b.email+" "+b.gender);   
	    }    

	}

}
class Contact{
	long phonenumb;
	String name,email;
	String gender;
	Contact(String name,String email,String gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
		
	}
}