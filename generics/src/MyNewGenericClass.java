public class MyNewGenericClass <T,V> {
    T data1;
    V data2;

    MyNewGenericClass(T data1,V data2){
        this.data1 = data1;
        this.data2 = data2;
    }

    public T getData1() {
        return data1;
    }

    public V getData2() {
        return data2;
    }
}
