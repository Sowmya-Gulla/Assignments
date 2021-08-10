import java.lang.*;
public class A3_Q2_1 {

	public static void main(String[] args) {
		
		/*StringBuffer buf=new StringBuffer("StringBuffer");
		buf.append(" is a peer class of String");
		buf.append(" that provides much of");
		buf.append(" the functionality of strings");
		System.out.println(buf);*/
		
		StringBuffer b=new StringBuffer();
		String s[]= {"StringBuffer"," is a peer class of String"," that provides much of"," the functionality of strings"};
	    for(int i=0;i<s.length;i++) {
	    	b.append(s[i]);
	    }
	    System.out.println(b);
	}
		

}
