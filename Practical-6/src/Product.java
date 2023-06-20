import java.io.*;

public class Product implements Serializable {

    public static int product_count;

    private String id;
    private String name;
    private Integer quantity;
    private Double price;

    Product(String name,Integer quantity,Double price){
        setId();
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }


    public void setId() {
        String product_id;
        product_count++;
        if(product_count<10){
            product_id = String.format("P00%s",Integer.toString(product_count));
        }else if(product_count<100){
            product_id = String.format("P0%s",Integer.toString(product_count));
        }else{
            product_id = String.format("P%s",Integer.toString(product_count));
        }
        this.id = product_id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public static int getProduct_count() {
        return product_count;
    }

    public String toString(){
        return String.format("\nProduct Id: %s\nProduct Name: %s\nProduct Quantity: %d\nProduct Price: %.2f\n",getId(),getName(),getProduct_count(),getPrice());
    }

}
