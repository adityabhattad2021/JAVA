public class variables {

    /*
     * Some Data types in JAVA
     * data type size primitive/refrence value
     * 
     * boolean 1bit primitive true or false
     * byte 1byte primitive -128 to 127
     * short 2bytes primitive -32,768 to 32,767
     * int 4bytes primitive -2billion to 2billion
     * long 8bytes primitive -9 quantillion to
     * 9 quantillion
     * float 4bytes primitive fractional number
     * upto 6-7 digits
     * double 8bytes primitive fractional number upto
     * 15 digits
     * char 2bytes primitive single character/letter/ASCII value
     * string varies reference a sequence of character.
     * 
     * 
     * Difference b/w primitive and refrence types?
     * =>Primitive
     * >8 types (boolean,bytes,etc.)
     * >stores data
     * >can only hold one value
     * >less memory
     * >faster
     * =>Reference
     * >Unlimited (user defined)
     * >stores an address
     * >could hold more than one value
     * >takes more memory
     * >slower
     * >Decleration of reference data types start with a capital letter
     *  i.e. String s;
     */

    public static void main(String[] args) {
        // variable decleration.
        int x;
        // assignment.
        x = 1;
        // initialization.
        int y = 1;

        System.out.println("x is "+x+" and y is "+y+".");
    }
}
