interface Helloworld{
    public void greet();
    public void greetSomeone(String someone);
}

public class AnonymousClass {
    
    public static void main(String[] args) {
        String name="Rahul Verma";
        Helloworld hindiGreeting= new Helloworld() {
            @Override
            public void greet(){
                System.out.println("Aur bhai, sab bhadiya?");
            }
    
            @Override
            public void greetSomeone(String name){
               System.out.println("Aur "+name+" bhai, sab bhadiya?"); 
            }
        };
        hindiGreeting.greetSomeone(name);
    }
}
