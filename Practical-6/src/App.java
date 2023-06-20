import java.io.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // To take user input.
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(in);

        // To write the product object to the file
        FileOutputStream fos = new FileOutputStream("products.ser", true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        System.out.println("Welcome to the shop");
        while (true) {
            System.out.println("Enter the product name: ");
            String product_name = bfr.readLine();
            System.out.println("Enter product quantity");
            int product_quantity = Integer.parseInt(bfr.readLine());
            System.out.println("Enter product price");
            double product_price = Double.parseDouble(bfr.readLine());
            Product pd = new Product(product_name, product_quantity, product_price);
            oos.writeObject(pd);
            System.out.println("Press 1 to continue 2 to stop: ");
            int toContinue = Integer.parseInt(bfr.readLine());
            if (toContinue == 2) {
                break;
            }
        }

        // Printing the product object
        FileInputStream fis = new FileInputStream("products.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        while (true) {
            try {
                Product pd = (Product) ois.readObject();
                System.out.println(pd);
            } catch (EOFException e) {
                break;
            }
        }

        // Closing all file related objects
        fos.close();
        oos.close();
        fis.close();
        ois.close();

        System.out.println("Welcome customer!");
        File file = new File("sales.txt");
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);

        while (true) {

            System.out.println("Enter your name: ");
            String name = bfr.readLine();
            ArrayList<Product> productsBought = new ArrayList<>();
            while (true) {
                System.out.println("Enter name of the product you want to buy: ");
                String pName = bfr.readLine();
                FileInputStream nfis = new FileInputStream("products.ser");
                ObjectInputStream nois = new ObjectInputStream(nfis);
                int productFound = 0;
                while (true) {
                    try {
                        // Checking if the customer entered product is available
                        Product pd = (Product) nois.readObject();
                        if (pd.getName().equalsIgnoreCase(pName)) {
                            productFound = 1;
                            System.out.println("Enter the quantity of the product you want to buy");
                            int quantity = pd.getQuantity();
                            int toBuy = Integer.parseInt(bfr.readLine());
                            pd.setQuantity(quantity - toBuy);
                            for (int x = 0; x < toBuy; x++) {
                                productsBought.add(pd);
                            }
                        }

                    } catch (EOFException e) {
                        break;
                    }
                }
                if (productFound == 0) {
                    System.out.println("Product not found!");
                }
                nois.close();
                nfis.close();
                System.out.println("1 to continue, 2 to stop.");
                int toContinue = Integer.parseInt(bfr.readLine());
                if (toContinue == 2) {
                    break;
                }
            }
            Customer ct = new Customer(name, productsBought.toArray(new Product[productsBought.size()]));
            // Writing the relavent data to the file
            if (file.length() == 0) {
                br.write(ct.toString());
                br.newLine();
            } else {
                br.append(ct.toString());
                br.newLine();
            }

            // Checking if there is another customer.
            System.out.println("1 there are more customers, 2 stop");
            int toContinue = Integer.parseInt(bfr.readLine());
            if (toContinue == 2) {
                break;
            }
        }

        bfr.close();
        in.close();

        // Closing all the file related objects.
        br.close();
        fr.close();

    }
}
