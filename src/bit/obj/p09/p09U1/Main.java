package bit.obj.p09.p09U1;

public class Main {
    public static void main(String[] args) {

        IPayment payments = new Employee();
        payments.add(new Employee("Jonas", "LT78912365478", 100));
        payments.add(new Employee("Petras", "LT12345678997", 1000));
        payments.add(new Employee("Ona", "LT11111111111", 178965));
        payments.add(new Employee("Juozas", "LT32887878741", 3658));

        IPayment clients = new Client();
        clients.add(new Client("Client1", "LT9874563217", 48957));
        clients.add(new Client("Client1", "LT9874563217", 35));
        clients.add(new Client("Client1", "LT9874563217", 468));
        clients.add(new Client("Client1", "LT9874563217", 55556));


    }
}