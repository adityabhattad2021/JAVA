public class Friend {
    // Static = Modifier. A single copy od a variable/method is created and shared.
    //          The class "owns" the static members.
    String name;
    static int numberOfFriends=0;
    Friend(String name){
        this.name=name;
        numberOfFriends++;
    }

    public static void allFriend(){
        System.out.printf("\nThere are total %d friends.\n",numberOfFriends);
    }

    public String toString(){
        return "Hi I am "+this.name+".\n";
    }
}
