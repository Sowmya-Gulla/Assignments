
  
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A10_Q3 {

	public static void main(String[] args) {
		
		String str = "A quik brown fox jumps over the lazy dog";

		List<String> l = new ArrayList<>(Arrays.asList(str.split(" ")));

		System.out.println(l);

	}

}