import java.util.TreeSet;

public class SWK {
    private TreeSet<SWKEmployee> allEmployees = new TreeSet<SWKEmployee>((SWKEmployee e1, SWKEmployee e2) -> {
        if (SWKDesignations.getDesignation(e1.getDesignation()) == SWKDesignations
                .getDesignation(e2.getDesignation())) {
            return Double.compare(e1.getSalary(), e2.getSalary());
        }
        return Integer.compare(SWKDesignations.getDesignation(e1.getDesignation()),
                SWKDesignations.getDesignation(e2.getDesignation()));
    });

    public SWK() {
        // Generated using ChatGPT.
        allEmployees.add(new SWKEmployee("Rahul", SWKDesignationsENUM.MANAGER, 50000));
        allEmployees.add(new SWKEmployee("Sneha", SWKDesignationsENUM.ASSISTANT_MANAGER, 40000));
        allEmployees.add(new SWKEmployee("Arun", SWKDesignationsENUM.CLERK, 30000));
        allEmployees.add(new SWKEmployee("Pooja", SWKDesignationsENUM.WORKER, 25000));
        allEmployees.add(new SWKEmployee("Ravi", SWKDesignationsENUM.MANAGER, 55000));
        allEmployees.add(new SWKEmployee("Anjali", SWKDesignationsENUM.ASSISTANT_MANAGER, 42000));
        allEmployees.add(new SWKEmployee("Vikram", SWKDesignationsENUM.CLERK, 31000));
        allEmployees.add(new SWKEmployee("Aarti", SWKDesignationsENUM.WORKER, 26000));
        allEmployees.add(new SWKEmployee("Amit", SWKDesignationsENUM.MANAGER, 52000));
        allEmployees.add(new SWKEmployee("Divya", SWKDesignationsENUM.ASSISTANT_MANAGER, 38000));
    }

    public void displayAllEmployees() {
        for (SWKEmployee e : allEmployees) {
            System.out.println(e);
        }
    }
}
