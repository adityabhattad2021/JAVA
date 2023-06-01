public class App {
    public static void main(String[] args) throws Exception {
        Office o = new Office();
        o.displayAll("Team Leader");
        o.displayAllManagers(o.getEmployeeByNumber(13));
    }
}
