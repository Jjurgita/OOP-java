package bit.obj.p09.p09U1;

public class Client implements IPayment {

    private String name;
    private String bankAcc;
    private int sum;

    public Client(String name, String bankAcc, int sum) {
        this.name = name;
        this.bankAcc = bankAcc;
        this.sum = sum;
    }

    public Client() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public void add(Client client) {

    }

    @Override
    public void add(Employee employee) {

    }
}
