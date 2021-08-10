import java.time.LocalDate;
import java.util.*;
public class A6_Q4 {

	public static void main(String[] args) {
		LocalDate d1=LocalDate.of(1999, 8, 23);
		LocalDate d2=LocalDate.of(1998, 2, 20);
		LocalDate d3=LocalDate.of(2000, 12, 23);
		LocalDate d4=LocalDate.of(2000, 12, 23);

		List<LocalDate> l=new ArrayList<>();
		l.add(d1);
		l.add(d2);
		l.add(d3);
		l.add(d4);
		for(LocalDate date:l) {
			if(date.isLeapYear()) {
				System.out.println("Your date of birth is "+date+" and it was a leap year");
			}
			else {
				System.out.println("Your date of birth is "+date+" and it was not a leap year");
			}
		}	
	}
}
