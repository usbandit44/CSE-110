import java.text.NumberFormat;

public class Employee {

    private String employeeName;
    private double salary;
    private int yearsOfExperience;
    private static int numOfEmployee;

    public Employee(){ // constructor
        employeeName = "???";
        salary = 0.0;
        yearsOfExperience = 0;
        numOfEmployee++;
    }

    public Employee(String name, double s, int years){
        employeeName = name;
        salary = s;
        yearsOfExperience = years;
        numOfEmployee++;
    }

    public Employee(String str){
        String[] nameArray = str.split(":", 3);
        employeeName = nameArray[0];
        double s = Double.parseDouble(nameArray[1]);
        int years = Integer.parseInt(nameArray[2]);
        salary = s;
        yearsOfExperience = years;
        numOfEmployee++;
    }

    public String getName(){
        return employeeName;
    }
    
    public int getYears(){
        return yearsOfExperience;
    }

    public double getSalary(){
        return salary;
    }

    public void setYears(){
        yearsOfExperience++;
    }

    public void raiseSalary(double byPercent){
        byPercent = byPercent / 100 ;
        double salaryIncrease = salary * byPercent;
        salary = salary + salaryIncrease;
    }

    public Employee makesMore(Employee x){
        if(salary > x.getSalary()){
            return this;
        }else{
            return x;
        }
    }

    public static int getNumEmployees(){
        return numOfEmployee;
    }

    public String toString(){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String to = "Name: " + employeeName + "\nSalary: " + fmt.format(salary) + "\nYears of Experience: " + yearsOfExperience;
        return to;
    }
}
