package bit.obj.p09.demo4;

public class Employee implements BonusA, BonusB {

    double salary;

    @Override
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /*
     *  Kadangi ir BonusA ir BonusB interfeisuose implementuotas
     *  metodas getBonus() tai gaunasi konfliktas ir
     *  tokį metodą privalu implementuoti klasėje
     */

    @Override
    public double getBonus() {
        return getSalary() * 1.3;
    }

}
