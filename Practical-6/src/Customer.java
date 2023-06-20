import java.util.ArrayList;
import java.util.HashMap;

public class Customer {

    private static int customerCount;

    private String customerId;
    private String name;
    private Product[] product_details;

    Customer(String name, Product[] productsBought) {
        setCustomerId();
        this.name = name;
        this.product_details = productsBought;
    }

    public void setCustomerId() {
        String customer_Id;
        customerCount++;
        if (customerCount < 10) {
            customer_Id = String.format("C00%s", Integer.toString(customerCount));
        } else if (customerCount < 100) {
            customer_Id = String.format("C0%s", Integer.toString(customerCount));
        } else {
            customer_Id = String.format("C%s", Integer.toString(customerCount));
        }
        this.customerId = customer_Id;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Product[] getProduct_details() {
        return product_details;
    }

    public String toString() {
        String productsBought = "";
        HashMap<String,Integer> products = new HashMap<>(); // hash map to store the product name corrosponding to product quantity.
        ArrayList<String> productName = new ArrayList<>();  // To store product name
        for (Product p : product_details) {  // Loops to all the products in the bought product array
            if(!productName.contains(p.getName())){  // checks if the productname arraylist contains the product already
                productName.add(p.getName()); // if not, adds the list of product names
                products.put(p.getName(),1); // also add in the hash map
            }else{ 
                products.replace(p.getName(), products.get(p.getName())+1);  // else update the already existing hashmap
            }
        }
        for(String name:products.keySet()){ // Loops through every key value pair in hashmap
            Integer quantity = products.get(name); 
            productsBought=productsBought.concat(String.format("%s : %d\n",name,quantity)); // add each product to the string of bought products
        }
        return String.format("Customer Id: %s\nCustomer Id: %s\nProducts bought by the customer are:\n%s",
                getCustomerId(), getName(), productsBought);  // return the entire customer info.
    }
}
