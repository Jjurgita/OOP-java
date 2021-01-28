package bit.obj.p09.demo6;

public class Main {
    public static void main(String[] args) {

        Salary salary = new Employee();
        salary.setSalary(20);
        System.out.println("Employee salary = " + salary.getSalary());

        Salary boss = new Boss();
        boss.setSalary(100);
        System.out.println("Boss salary = " + boss.getSalary());

    }
}
