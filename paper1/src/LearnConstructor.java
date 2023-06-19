class X{
    X(){
        System.out.println("Inside X's Constructor");
    }
}

class Y extends X {
    Y(){
        System.out.println("Inside Y's Constructor");
    }
}

class Z extends Y{
    Z(){
        System.out.println("Inside Z's Constructor");
    }
}

public class LearnConstructor {
    public static void main(String[] args) {
        Z z = new Z();
    }
}
