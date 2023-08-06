import java.io.*;
import java.util.ArrayList;

public class App {

    /*
     * Write a program to list all the files and directories of D:\. If
     * the file in consideration is a directory then display all the
     * files and directories also.
     */
    // public static void main(String[] args) throws Exception {
    // // Get location of current directory
    // String currentDirectory = System.getProperty("user.dir");
    // System.out.println("Current working directory : " + currentDirectory);
    // // Get all the files and directories of current directory
    // FilePrinter.printAllFilesAndDirectories("C:/users/adity/Downloads",0);
    // }

    // public static void main(String[] args) throws Exception {
    // String currentDirectory = System.getProperty("user.dir");
    // System.out.println(currentDirectory);
    // System.out.println((int)'a'+25);
    // FileIOHelpers.writeInCapitalAndNormal("Hello, World");
    // }

    // public static void main(String[] args) throws Exception {
    // File salesFile = new File("sales-details.txt");
    // BufferedReader bufferedReader = new BufferedReader(new
    // FileReader(salesFile));
    // String line;
    // do {
    // line = bufferedReader.readLine();
    // if(line==null){
    // break;
    // }
    // String commodityName = line.split(" ")[0];
    // Integer commodityPrice = Integer.parseInt(line.split(" ")[1]);
    // Integer commodityQuantity = Integer.parseInt(line.split(" ")[2]);
    // System.out.printf("You ordered %d units of %s at price Rs %d and the bill is
    // Rs
    // %d.\n",commodityQuantity,commodityName,commodityPrice,commodityPrice*commodityQuantity);
    // } while (line != null);
    // bufferedReader.close();
    // }

    // public static void main(String[] args) throws Exception{
    // File fileToWriteObjectIn = new File("object-store.ser");
    // FileOutputStream fos = new FileOutputStream(fileToWriteObjectIn);
    // ObjectOutputStream oos = new ObjectOutputStream(fos);
    // SampleObject so = new SampleObject("I was written in the File");
    // oos.writeObject(so);
    // oos.close();
    // fos.close();
    // FileInputStream fis = new FileInputStream(fileToWriteObjectIn);
    // ObjectInputStream ois = new ObjectInputStream(fis);
    // SampleObject objectFromFile = (SampleObject) ois.readObject();
    // System.out.println(objectFromFile);
    // ois.close();
    // }

    // public static void main(String[] args) throws Exception {
    // GenericClassExample<String> stringClass = new GenericClassExample<String>("I
    // am starting to love JAVA");
    // GenericClassExample<Integer> integerClass = new
    // GenericClassExample<Integer>(23);
    // GenericClassExample<Double> doublClass = new
    // GenericClassExample<Double>(23.45);
    // genericClassPrinter(stringClass);
    // genericClassPrinter(integerClass);
    // genericClassPrinter(doublClass);
    // }

    // public static void genericClassPrinter(GenericClassExample<?> obj){
    // System.out.println(obj);
    // }

    // public static void main(String[] args) throws Exception {
    //     ArrayList<Integer> scoreBoard = new ArrayList<>();
    //     Server server = new Server(scoreBoard);
    //     Client client = new Client(scoreBoard);

    //     Thread serverThread = new Thread(new Runnable() {
    //         @Override
    //         public void run() {
    //             int a = 0;
    //             try {
    //                 while (true) {
    //                     server.publishScore(a);
    //                     Thread.sleep(1000);
    //                     a++;
    //                 }
    //             } catch (InterruptedException e) {
    //                 e.printStackTrace();
    //             }
    //         }
    //     });
    //     serverThread.setName("Server Thread");

    //     Thread clientThread1 = new Thread(new Runnable() {
    //         @Override
    //         public void run() {
    //             client.read();
    //         }
    //     });
    //     Thread clientThread2 = new Thread(new Runnable() {
    //         @Override
    //         public void run() {
    //             client.read();
    //         }
    //     });
    //     Thread clientThread3 = new Thread(new Runnable() {
    //         @Override
    //         public void run() {
    //             client.read();
    //         }
    //     });
    //     Thread clientThread4 = new Thread(new Runnable() {
    //         @Override
    //         public void run() {
    //             client.read();
    //         }
    //     });

    //     clientThread1.setName("Client Thread 1");
    //     clientThread2.setName("Client Thread 2");
    //     clientThread3.setName("Client Thread 3");
    //     clientThread4.setName("Client Thread 4");

    //     serverThread.start();
    //     clientThread1.start();
    //     clientThread2.start();
    //     clientThread3.start();
    //     clientThread4.start();
    // }

    // public static void main(String[] args) throws Exception {

    //     ArrayList<Integer> tray = new ArrayList<>(10);


    //     // (Producer consumer problem.)
    //     // Producer Thread
    //     Thread producer = new Thread(new Runnable() {
    //         @Override
    //         public void run(){
    //             try{
    //                 while(true){
    //                     synchronized(tray){
    //                         if(tray.size()==1){
    //                             tray.wait();
    //                         }
    //                         Thread.sleep(1000);
    //                         tray.add(1);
    //                         System.out.println("Producer produced a resource.");
    //                         tray.notify();
    //                     }
    //                 }
    //             }catch(InterruptedException e){
    //                 e.printStackTrace();
    //             }
    //         }
    //     });

    //     // Consumer thread
    //     Thread consumer = new Thread(new Runnable(){
    //         @Override
    //         public void run(){
    //             try{
    //                 while(true){
    //                     synchronized(tray){
    //                         if(tray.isEmpty()){
    //                             tray.wait();
    //                         }
    //                         System.out.println("Consumer consumed a resource.");
    //                         tray.remove(0);
    //                         tray.notify();
    //                     }
    //                 }
    //             }catch(InterruptedException e){
    //                 e.printStackTrace();
    //             }
    //         }
    //     });

    //     producer.start();
    //     consumer.start();
    // }   


    // Dinning philosopher problem.
    // public class Table{
    //     private boolean[] usedForks;

    //     public Table(int numberOfForks){
    //         usedForks = new boolean[numberOfForks];
    //         for(int x=0;x<numberOfForks;x++){
    //             usedForks[x]=false;
    //         }
    //     }

    //     private int leftFork(int forkNumber){
    //         // for left for philosopher will use fork at same number.
    //         return forkNumber%usedForks.length;
    //     }

    //     private int rightFork(int forkNumber){
    //         // but for right it will use fork at number i+1
    //         // Modulo by usedForks array's length so that it does not exceed the length of the number of forks.
    //         return (forkNumber+1)%usedForks.length;
    //     }

    //     public void takeForks(int place) throws InterruptedException{
    //         synchronized(usedForks){
    //             if(usedForks[leftFork(place)] || usedForks[rightFork(place)]){
    //                 usedForks.wait();
    //             }
    //             usedForks[leftFork(place)]=true;
    //             usedForks[rightFork(place)]=true;
    //         }
    //     }

    //     public void keepBackForks(int place) throws InterruptedException {
    //         synchronized(usedForks){
    //             if(usedForks[leftFork(place)]|| usedForks[rightFork(place)]){
    //                 usedForks[leftFork(place)]=false;
    //                 usedForks[rightFork(place)]=false;
    //             }
    //         }
    //     }
    // }


    // public class Philosopher extends Thread{
    //     private Table table;
    //     private int placeOnTheTable;
    //     private static int threadNumber = 0;

    //     public Philosopher(Table table){
    //         this.table = table;
    //         threadNumber++;
    //         placeOnTheTable=threadNumber;
    //         this.start();
    //     }

    //     private void think(){
    //         try{
    //             System.out.printf("Philosopher %d started thinking...\n",placeOnTheTable);
    //             Thread.sleep(1000);
    //             System.out.printf("Philosopher %d stopped thinking!\n",placeOnTheTable);
    //         }catch(InterruptedException e){
    //             e.printStackTrace();
    //         }
    //     }


    //     private void eat(){
    //         try{
    //             System.out.printf("Philosopher %d started eating...\n",placeOnTheTable);
    //             Thread.sleep(1000);
    //             System.out.printf("Philosopher %d stopped eating!\n",placeOnTheTable);
    //         }catch(InterruptedException e){
    //             e.printStackTrace();
    //         }
    //     }

    //     @Override
    //     public void run(){
    //         try{
    //             think();
    //             table.takeForks(placeOnTheTable);
    //             eat();
    //             table.keepBackForks(placeOnTheTable);
    //         }catch(Exception e){
    //             e.printStackTrace();
    //         }
    //     }
    // }

    // // In JAVA: If you want to create an instance of the nested class, you need to do it within an instance of the enclosing class.
    // public static void main(String[] args) throws Exception{
    //     // Create an instance of the enclosing class
    //     App app = new App();

    //     // Create an instance of the nested class directly
    //     Table table = app.new Table(5);
    //     for(int x=0;x<5;x++){
    //         app.new Philosopher(table);
    //     }
    // }
}
