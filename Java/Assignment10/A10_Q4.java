import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class A10_Q4 {

	public static void main(String[] args) {
		var path="C:\\Users\\SOWMYA\\Downloads\\Java11Assignments_StudentList.txt";
		File file = new File("C:\\Users\\SOWMYA\\Downloads\\Java11Assignments_StudentList.txt");
      
        
		try {
			BufferedReader buf = new BufferedReader(new FileReader(file));
			  
			  String s;
			  System.out.println("\nReading Data From File");
			  while ((s = buf.readLine()) != null)
			  {
				  System.out.println(s);
			  }
			  System.out.println("\nAfter Removing Whitspace From File");
			  Files.lines(new File("C:\\Users\\SOWMYA\\Downloads\\Java11Assignments_StudentList.txt").toPath())
			    .map(i -> i.trim())
			 .filter(i -> !i.isEmpty())
			 .forEach(System.out::println);
			  
			  System.out.println("\nTotal Count of Students"); 
			 Long count= Files.lines(new File("C:\\Users\\SOWMYA\\Downloads\\Java11Assignments_StudentList.txt").toPath())
					 .map(i -> i.trim())
					 .filter(i -> !i.isEmpty()).count();
			 
			 System.out.println(count);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}