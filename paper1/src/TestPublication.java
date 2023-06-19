class Publication {
    private String title;
    private String price;

    Publication(String title, String price) {
        this.title = title;
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void display(){
        System.out.printf("Title: %s\nPrice is %s",getTitle(),getPrice());
    }
}

class Book extends Publication {
    private int pageCount;

    Book(String title, String price, int pageCount) {
        super(title, price);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void display(){
        super.display();
        System.out.printf("\nPage Count: %d",getPageCount());
    }
}

class Tape extends Publication {

    private int playTimeInMinute;

    Tape(String title,String price,int playTimeInMinute){
        super(title,price);
        this.playTimeInMinute=playTimeInMinute;
    }

    public int getPlayTimeInMinute() {
        return playTimeInMinute;
    }

    public void display(){
        super.display();
        System.out.printf("\nPlay time in miunte: %d",getPlayTimeInMinute());
    }
}


// Now this class cannot be extended.
final public class TestPublication{
    final public static void main(String[] args) {
        // This is an example of dynamic method dispatch.
        Publication b1 = new Book("Aoole", "12", 31);
        b1.display();
    }
}