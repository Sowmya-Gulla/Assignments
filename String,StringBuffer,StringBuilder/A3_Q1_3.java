
public class A3_Q1_3 {

	public static void main(String[] args) {
		String str="Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println(str);
		String str2=str.toLowerCase();
		System.out.println(str2);
		String str3=str.toUpperCase();
		System.out.println(str3);
		String str4=str.replace("a", "$");
		System.out.println(str4);
		if(str.contains("collection")) {
			System.out.println("Yes, The String contains collection");	
		}
		if(str.equals(str2)) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Not equal");
		}
		if(str.equalsIgnoreCase(str2)) {
			System.out.println("Both are equal");
		}
		
		

	}

}
