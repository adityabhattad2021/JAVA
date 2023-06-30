public class MyArry<T> {

    private T[] arry;
    private int noofElement;
    private int size;

    MyArry(int size) {
        noofElement = 0;
        this.arry = (T[]) new Object[size];
        this.size = size;
    }

    public void add(T element) {
        if (noofElement < size) {
            this.arry[noofElement] = element;
            noofElement++;
        } else {
            grow();
            add(element);
        }
    }

    private void grow() {
        int newSize = (int) (this.size * 1.5);
        T[] newArry = (T[]) new Object[newSize];
        for(int x=0;x<this.arry.length;x++){
            newArry[x]=this.arry[x];
        }
        this.arry=newArry; 
        this.size=newArry.length;       
    }

    public void swap(int index1, int index2) {
        try{
            if (index1 < 0 || index1 > this.arry.length || index2 < 0 || index2 > this.arry.length) {
                throw new Exception("Invalid indexes");
            }
            T element = this.arry[index1];
            this.arry[index1]=this.arry[index2];
            this.arry[index2]=element;
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public int getSize() {
        return size;
    }

    public int getNoofElement() {
        return noofElement;
    }

    public T get(int index) {
        return this.arry[index];
    }

}
