public class strings {
    public static void main(String[] args) {
        // String is a referance data type that can store one or more characters refrence data types that have access to some useful data types.

        String name = "Aditya";
        String name1 = "           Bhattad           ";

        // Some useful string methods.
        boolean r1 = name.equalsIgnoreCase("aditya");
        boolean r2 = name.equals("Aditya");
        char r3 = name.charAt(2);
        int r4 = name.indexOf("t");
        String r5 = name1.trim();


        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

    }
}
