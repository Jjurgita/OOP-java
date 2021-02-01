package bit.obj.p09.p09U1;

public class Employee implements IPayment{

    private String name;
    private String bankAcc;
    private int sum;

    public Employee(String name, String bankAcc, int sum) {
        this.name = name;
        this.bankAcc = bankAcc;
        this.sum = sum;
    }

    public Employee() {

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

    public void setSum(int sum) {
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
    public int getSum() {
        return 0;
    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void add(Client client) {

    }

}
