public class App {

    static void errorThrower(){
        try{
            throw new NullPointerException("demo");
        } catch(NullPointerException e){
            System.out.println("Caught inside errorThrower: "+e);
            throw e;
        }
    }

    public static void main(String[] args) throws Exception {
        try{
            errorThrower();
        }catch(NullPointerException e){
            System.out.println("Recaught: "+e);
            try{
                throw e;
            }catch(NullPointerException error){
                System.out.println("Again caught error inside inner catch"+error);
            }
        }
    }
}
