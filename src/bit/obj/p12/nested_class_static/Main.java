package bit.obj.p12.nested_class_static;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Employee.CompanyName = "ABC";
        Employee employee = new Employee();
        employee.name = "Jonas";
        employee.position = new Employee.Position();
        employee.position.salary = BigDecimal.valueOf(50);

        System.out.println(employee.name + " " + employee.position.print());
    }
}
