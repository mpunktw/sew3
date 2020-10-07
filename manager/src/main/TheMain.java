package main;

import manager.*;

public class TheMain
{
    public static void main(String[] args) {
        //not working because abstract!
        //Person p = new Person("Andreas","Fischergasse 30, 4600 Wels");

        Manager m = new Manager("Andreas","4600 Wels");
        m.setSalary(2500);
        m.setBonus(800);

        Employee e = new Employee("Peter", "4040 Linz");
        e.setSalary(1500);

        Trainee t = new Trainee("Walter", "4040 Linz");
        t.setSalary(1500);
        t.setTermInDays(65);

        System.out.println(m.toString());
        System.out.println(e.toString());
        System.out.println(t.toString());
    }
}
