package bit.obj.p09.demo5;

public interface Salary {

    double getSalary();

    void setSalary(double salary);

    default void incSalary(double percent) {
        setSalary(getTotal(getSalary(), percent));
    }

    static double getTotal(double salary, double percent) {
        return salary * (1.0 + percent / 100.0);
    }

}
