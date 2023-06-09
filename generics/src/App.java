import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        // generics = enables types (classes and interfaces) to be parameters when defining
        // classes, interfaces and methods
        // a benifit is to eliminate the need to create multiple versions of the same
        // No mthod overloading needed


        // Bounded types = You can create the objects of a generic cass to have data of specific type
        Integer[] intArry = {1,2,3,4,5,6};
        Double[] doubleArry = {1.2,3.33,2.22,5.21};
        String[] strArry = {"H","E","L","L"};
        ArrayList<Integer> intarr =  new ArrayList<Integer>();
        ArrayList<Double> doublearr =  new ArrayList<Double>();
        intarr.add(12);
        intarr.add(113);
        intarr.add(5);
        intarr.add(14);
        intarr.add(32);
        intarr.add(342);
        doublearr.add(112.1212);
        doublearr.add(34.1212);
        display(doublearr,doublearr);
        // display(intArry);
        // display(doubleArry);
        // display(strArry);
        // System.out.println(returnFirstElement(intArry));
        // System.out.println(returnFirstElement(doubleArry));
        // System.out.println(returnFirstElement(strArry));

        // NormalClass intNormalClass = new NormalClass(12);
        // DoubleNormalClass doubleNormalClass = new DoubleNormalClass(12.12);

        // MyGenericClass<Integer> intClass = new MyGenericClass<>(1);
        // MyGenericClass<Double> doubleClass = new MyGenericClass<Double>(3.25);
        // MyGenericClass<Character> charClass = new MyGenericClass<Character>('d');
        // MyGenericClass<String> stringClass = new MyGenericClass<String>("aditya");

        // MyNewGenericClass<Integer,String> intStringClass = new MyNewGenericClass<>(1, "aditya");
        // MyNewGenericClass<Character,Double> charDoubleClass = new MyNewGenericClass<Character,Double>('d', 3.82);

        // This class will only accepts datatypes that are childrens of Number class (Check BoundedGenericClass.java file)
        // BoundedGenericClass<String> intClass = new BoundedGenericClass<>("askdj");

        // System.out.println(intClass.getData());
        // System.out.println(doubleClass.getData());
        // System.out.println(charClass.getData());
        // System.out.println(stringClass.getData());

        // System.out.println(intStringClass.getData1());
        // System.out.println(intStringClass.getData2());
        // System.out.println(charDoubleClass.getData1());
        // System.out.println(charDoubleClass.getData2());


    }

    public static <T> void display(T[] arry){
        for(T x:arry){
            System.out.println(x+" ");
        }
    }

    public static void display(ArrayList<?> numbers,ArrayList<?> n1){
        for(Object i:numbers){
            System.out.println(i);
        }
        for(Object i:n1){
            System.out.println(i);
        }
    }

    public static <Datatype> Datatype returnFirstElement(Datatype[] arry){
        return arry[0];
    }
}
