import java.util.ArrayList;

public class Client {
    ArrayList<Integer> scoreBoard;
    int size;

    public Client(int size,ArrayList<Integer> scoreBoard){
        this.size=size;
        this.scoreBoard=scoreBoard;
    }

    public void read(){
        while(true){
            synchronized(scoreBoard){
                try {
                    if(scoreBoard.size()==0){
                        scoreBoard.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int score=scoreBoard.get(0);
                System.out.println("Client Read the score board: "+score);
                size--;
                try {
                    scoreBoard.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
