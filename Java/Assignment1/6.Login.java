import java.util.*;
public class Login {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String user_id="Sowmya";
		String password="ss123";
		int attempts=3;
		while(true) {
			System.out.print("Enter Username:" );
			String username=sc.next();
			System.out.print("Enter Password:" );
			String pwd=sc.next();
			if(username.equals(user_id) && password.equals(pwd)){
				System.out.println("Welcome "+username);
				break;
			}
			else {
				System.out.println("Please enter valid Username and Password");
				System.out.println("Attempts left:"+ --attempts);
				if(attempts==0) {
					System.out.println("Contact Admin");
					break;
				}
			}
		}
		

	}

}
