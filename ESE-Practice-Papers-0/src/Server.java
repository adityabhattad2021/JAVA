import java.util.ArrayList;

public class Server {
    
    ArrayList<Integer> scoreBoard;

    public Server(ArrayList<Integer> scoreBoard){
        this.scoreBoard=scoreBoard;
    }

    public void publishScore(int score){
        synchronized(scoreBoard){
            if(scoreBoard.size()!=0){
                scoreBoard.remove(0);
            }
            scoreBoard.add(score);
            System.out.println("Server updated the score: "+score+".");
            scoreBoard.notifyAll();
        }
    }

}
