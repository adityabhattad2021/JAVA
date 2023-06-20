public class MyGenericClass <T> {
    T data;

    MyGenericClass(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
