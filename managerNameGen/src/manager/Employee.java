package manager;

public class Employee extends Person {

    private double salary;

    public Employee()
    {

    }

    public Employee(String name, String address)
    {
        super(name, address);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + this.getName() + "\n");
        sb.append("Address: " + this.getAddress()  + "\n");
        sb.append("Salary: " + this.getSalary()  + "\n");
        return sb.toString();
    }
}
