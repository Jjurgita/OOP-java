package bit.obj.p09.p09U1;

public interface IPayment {

    String getBankAcc();
    String getOwner();
    int getSum();

    void add(Employee employee);

    void add(Client client);
}
