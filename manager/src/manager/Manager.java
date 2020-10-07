package manager;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, String address)
    {
        super(name, address);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + this.getName() + "\n");
        sb.append("Address: " + this.getAddress()  + "\n");
        sb.append("Salary (incl. Bonus): " + String.valueOf(this.getSalary() + this.getBonus())  + "\n");
        return sb.toString();
    }
}
