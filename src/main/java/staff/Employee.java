package staff;

public abstract class Employee {
    private String name;
    private String NI;
    public double salary;

    public Employee(String name, String NI, double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNI() {
        return NI;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        if(name == null){
            name = this.name;
        }
        this.name = name;
    }

    public void raiseSalary(double raiseAmount) {
        if (raiseAmount < 0){
            raiseAmount = 0;
        }
        double newSalary = this.salary + raiseAmount;
       setSalary(newSalary);
    }

    public double payBonus(){
        double increase = this.salary /100;
        return increase;
    }
}
