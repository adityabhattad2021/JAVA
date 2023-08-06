import java.util.ArrayList;

public class Client {
    
    ArrayList<Integer> scoreBoard;

    public Client(ArrayList<Integer> scoreBoard){
        this.scoreBoard=scoreBoard;
    }

    public void read() {
        while(true){
            synchronized(scoreBoard){
                try{
                    if(scoreBoard.isEmpty()){
                        scoreBoard.wait();
                    }
                    int score=scoreBoard.get(0);
                    System.out.println("Client Read the score: "+score+".");
                    scoreBoard.wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
