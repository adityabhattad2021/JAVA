public class MyThread extends Thread {

    int a[]; // array to be sorted
    private int sum;

    public MyThread(int a[],String name){
        super(name);
        this.a = a;
        this.sum = 0;
    }

    @Override
    public void run() {
        for(int i = 0;i<a.length;i++){
            sum+=a[i];
        }
    }

    public int getSum(){
        return sum;
    }

}
