package bit.obj.p09.p09U1;

import java.math.BigDecimal;

public class Employee implements IPayment {

    private String name;
    private String bankAcc;
    private BigDecimal sum;

    public Employee(String name, String bankAcc, BigDecimal sum) {
        this.name = name;
        this.bankAcc = bankAcc;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBankAcc(String bankAcc) {
        this.bankAcc = bankAcc;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    @Override
    public String getBankAcc() {
        return bankAcc;
    }

    @Override
    public String getOwner() {
        return name;
    }

    @Override
    public BigDecimal getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Bank account number: " + getBankAcc() + ", Sum: " + getSum();
    }
}
