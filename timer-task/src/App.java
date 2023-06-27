import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Timer = A facility for threads to schedule tasks for future execition in background thread
         * 
         * TimerTask = A task that can be scheduled for one time or repeated execution by a timer
         * 
         */

         Timer timer = new Timer();

         TimerTask task = new TimerTask() {

            int counter = 10;

            @Override
            public void run(){
                if(counter>0){
                    System.out.println(String.format("%d seconds left!",counter));
                    counter--;
                }else{
                    System.out.println("Timer is done :)");
                    timer.cancel(); 
                }
            }
         };

        //  timer.schedule(task, 3000);
        // delay = Time after which the execution of the task should start.
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
