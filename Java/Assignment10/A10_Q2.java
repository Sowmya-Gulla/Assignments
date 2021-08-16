


/* Scenario 1-var cannot be used as a Generic type.
 //It cannot be resolved into particular type
 class A {
    public static void main(String[] args)
    {
        var<var> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
 
        System.out.println(al);
    }
}

Scenario 2-var cannot be used in an instance and global variable declaration
We Cannot make a static reference to the non-static field x
class A {
  
    // instance variable
    var x = 50;
    public static void main(String[] args)
    {
        System.out.println(x);
    }
}

Scenario 3-var cannot be used without explicit initialization.
Cannot use 'var' on variable without initializer
	Duplicate local variable variable
	Cannot infer type for local variable initialized to 'null'
class A {
    public static void main(String[] args)
    {
        var variable;
        var variable = null;
    }
}
 
 Scenario 4- var cannot be used for method parameters and return type
 class A {

    var method1() {
     return ("Inside Method1");
      }
  

    void method2(var a) { 
    System.out.println(a); 
    }
  
    public static void main(String[] args)
    {
        A obj = new A();
        var res = obj.method1();
        obj.method2();
    }
}
Scenario 5- var cannot be used with Lambda Expression
var cannot be used since they require explicit target type
interface myInt {
    
    int add(int a, int b);
}
class A {
    public static void main(String[] args)
    {       
        var obj = (a, b) -> (a + b);
        System.out.println(obj.add(2, 3));
    }
}
 

 */

   
public class A10_Q2 {
	public static void main(String[] args)
    {
		
    }

}
