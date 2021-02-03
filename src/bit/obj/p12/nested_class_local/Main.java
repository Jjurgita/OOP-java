package bit.obj.p12.nested_class_local;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "Jonas";
        employee.number = "869812345";

        System.out.println(employee.print());
    }
}
