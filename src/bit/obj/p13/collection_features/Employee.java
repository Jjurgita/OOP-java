package bit.obj.p13.collection_features;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Employee implements Comparable<Employee> {
    private long id;
    private String name;
    private String dep; //department
    BigDecimal salary;

    public Employee(long id, String name, String dep, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.dep = dep;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + dep + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        Employee employee = (Employee) o;
        if (getId() < employee.getId()) return -1;
        if (getId() > employee.getId()) return 1;

        int comp = getName().compareTo(employee.getName());
        if (comp != 0) return comp;

        comp = getDep().compareTo(employee.getDep());
        if (comp != 0) return comp;

        return getSalary().compareTo(employee.getSalary());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (dep != null ? !dep.equals(employee.dep) : employee.dep != null) return false;
        return salary != null ? salary.equals(employee.salary) : employee.salary == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (dep != null ? dep.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        return result;
    }
}
