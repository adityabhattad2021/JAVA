import java.util.ArrayList;

public class Server {
    ArrayList<Integer> scoreBoard;
    int size;

    public Server(int size,ArrayList<Integer> scoreBoard){
        this.size=size;
        this.scoreBoard=scoreBoard;
    }

    public void publish(int a){    
            synchronized(scoreBoard){
                if(scoreBoard.size()!=0){
                    scoreBoard.remove(0);
                }
                int score = 10;
                scoreBoard.add(score+a);
                System.out.println("Server updated the score board: "+(score+a));
                scoreBoard.notifyAll();
            }
        
    }

}