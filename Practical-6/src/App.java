import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bfr = new BufferedReader(in);

        // FileOutputStream fos = new FileOutputStream("products.ser", true);
        // ObjectOutputStream oos = new ObjectOutputStream(fos);

        // System.out.println("Welcome to the shop");
        // while(true){
        //     System.out.println("Enter the product name: ");
        //     String product_name=bfr.readLine();
        //     System.out.println("Enter product quantity");
        //     int product_quanity =Integer.parseInt(bfr.readLine());
        //     System.out.println("Enter product price");
        //     double product_price =Integer.parseInt(bfr.readLine());
        //     Product pd = new Product(product_name, product_quanity, product_price);
        //     oos.writeObject(pd);
        //     System.out.println("Press 1 to continue 2 to stop: ");
        //     int toContinue = Integer.parseInt(bfr.readLine());
        //     if(toContinue==2){
        //         break;
        //     }
        // }
        
        // fos.close();
        // oos.close();
        FileInputStream fis = new FileInputStream("products.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        while(true){
            try{
                Product pd = (Product) ois.readObject();
                System.out.println(pd);
            } catch(EOFException e){
                break;
            }
        } 
        fis.close();
        ois.close();
    }
}
