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
        if(this.arry.length<=size){
            this.arry[noofElement] = element;
            noofElement++;
        }else{
            grow();
            add(element);
        }
    }

    private void grow() {
        int newSize = (int) (this.size*1.5);
        T[] newArry = (T[]) new Object[newSize];
        System.arraycopy(this.arry, 0, newArry, 0, this.size);
    }

    public void swap(int index1,int index2) {
        if(index1<0 || index1>this.arry.length || index2<0 || index2>this.arry.length){
            try {
                throw new Exception("Invalid indexes");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int getSize() {
        return size;
    }

    public T get(int index){
        return this.arry[index];
    }

}
