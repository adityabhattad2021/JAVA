public class App {
    public static void main(String[] args) {
        Stack st = new Stack(10);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.print("Your Stack is : ");
        st.display();
        st.pop();
        st.pop();
        System.out.println("");
        System.out.print("Your Stack is : ");
        st.display();
    }
}
