package package2;
import package1.*;

public class D extends C {
    public static void main(String[] args) {
        C c = new C(); 
        A a = new A(); 
        System.out.println(c.p);      
        System.out.println(a.str);      
        // System.out.println(a.anotherStr);    // This will error out as well, because another string is default variable.  
        // System.out.println(c.cp);      
    }
}
