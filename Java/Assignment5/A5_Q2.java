import java.util.*;
public class A5_Q2 {

	public static void main(String[] args) {
		int i=0;
		double j=0;

        HashMap<Integer,Double> map = new HashMap<Integer,Double>(10);
        /*for(i=1; i < 10; i++) {
            map.put((int)Math.random(),Math.random());  
        }*/
        
       Random obj = new Random();
       for (int iCount = 0; iCount< 10; iCount++){
          map.put(obj.nextInt(100),obj.nextDouble()); 
         }
        for(Map.Entry m:map.entrySet()){    
            System.out.println("Key : "+ m.getKey()+"  "+"Value : "+m.getValue());    
           }

	}

}
