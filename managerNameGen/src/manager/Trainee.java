package manager;

public class Trainee extends Employee {

    private int termInDays;

    public Trainee(String name, String address)
    {
        super(name, address);
    }

    public int getTermInDays() {
        return termInDays;
    }

    public void setTermInDays(int termInDays) {
        this.termInDays = termInDays;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + this.getName() + "\n");
        sb.append("Address: " + this.getAddress()  + "\n");
        sb.append("Salary: " + this.getSalary()  + "\n");
        sb.append("Term: " + this.getTermInDays()  + "\n");
        return sb.toString();
    }
}
