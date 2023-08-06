public class Office {
    private Employee[] arrayOfEmployees;

    public Office(){
        arrayOfEmployees = new Employee[13];
        arrayOfEmployees[0]=new Employee("Employee 1","Apple","Gaming","HR Manager",null);        
        arrayOfEmployees[1]=new Employee("Employee 2","Apple","Gaming","Project Manager",arrayOfEmployees[0]);        
        arrayOfEmployees[2]=new Employee("Employee 3","Apple","Gaming","Project Manager",arrayOfEmployees[0]);        
        arrayOfEmployees[3]=new Employee("Employee 4","Apple","Gaming","Project Manager",arrayOfEmployees[0]);        
        arrayOfEmployees[4]=new Employee("Employee 5","Apple","Gaming","Team Leader",arrayOfEmployees[1]);        
        arrayOfEmployees[5]=new Employee("Employee 6","Apple","Gaming","Team Leader",arrayOfEmployees[2]);        
        arrayOfEmployees[6]=new Employee("Employee 7","Apple","Gaming","Team Leader",arrayOfEmployees[3]);        
        arrayOfEmployees[7]=new Employee("Employee 8","Apple","Gaming","Team Leader",arrayOfEmployees[3]);        
        arrayOfEmployees[8]=new Employee("Employee 9","Apple","Gaming","Developer",arrayOfEmployees[4]);        
        arrayOfEmployees[9]=new Employee("Employee 10","Apple","Gaming","Developer",arrayOfEmployees[5]);        
        arrayOfEmployees[10]=new Employee("Employee 11","Apple","Gaming","Developer",arrayOfEmployees[5]);        
        arrayOfEmployees[11]=new Employee("Employee 12","Apple","Gaming","Developer",arrayOfEmployees[7]);        
        arrayOfEmployees[12]=new Employee("Employee 13","Apple","Gaming","Developer",arrayOfEmployees[7]);        
    }

    public Employee getEmployeeByNumber(int number){
        return arrayOfEmployees[number-1];
    }


    public void displayAllManagers(Employee e){
        Employee tempE;
        if(e.getReportingManager()==null){
            System.out.println(e.getName()+" is the team HR Manager of the company!");
            return;
        }
        tempE=e;
        System.out.println("Reporting manager of "+tempE.getName()+" are:");
        do{
            System.out.println(tempE.getReportingManager().getName());
            tempE=tempE.getReportingManager();
        }while(tempE.getReportingManager()!=null);
    }
    public void displayAllManagers(Employee e) {
        if (e.getReportingManager() == null) {
            System.out.println(e.getName() + " is the team HR Manager of the company!");
        } else {
            System.out.println("Reporting manager of " + e.getName() + " are:");
            displayReportingManagers(e.getReportingManager());
        }
    }

    private void displayReportingManagers(Employee e) {
        if (e.getReportingManager() != null) {
            displayReportingManagers(e.getReportingManager());
        }
        System.out.println(e.getName());
    }

    public void displayAll(String employeeAtPosition){
        for(Employee e:arrayOfEmployees){
            if(e.getPosition().equalsIgnoreCase(employeeAtPosition)){
                System.out.println(e.getName());
            }
        }
    }
}
