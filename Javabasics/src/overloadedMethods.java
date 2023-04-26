public class overloadedMethods {
    public static void main(String[] args) {
        // Overloaded methods = Methods that share the name but have different parameters
        //                      method name + parameters = method signature. (  Same as Solidity :) )

        int x = add(1,2);
        System.out.println("Answer is: "+x+".");
        x = add(1,2,3);
        System.out.println("Answer is: "+x+".");
        
        x = add(1,2,3,4);
        System.out.println("Answer is: "+x+".");
        System.out.printf("Hey, i can use printf in Java too!\nLook i can add format specifier like %%d. like this %d.",x);
    }

    static int add(int a,int b){
        System.out.println("This is method #1");
        return a+b;
    }
    static int add(int a,int b,int c){
        System.out.println("This is method #2");
        return a+b+c;
    }
    static int add(int a,int b,int c,int d){
        System.out.println("This is method #3");
        return a+b+c+d;
    }

    
}
