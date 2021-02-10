package bit.obj.p09.p09U1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

/*
     1 DALIS
        Aprašykite interfeisą Mokėjimas (Payment) su šiais metodais:
        1) banko sąskaita (bank account) - grąžina banko sąskaitos numerį
        2) sąskaitos turėtojas (account owner) - fizinio ar juridinio asmens pavadinimas
        3) suma (amount) - pervedama suma

        Sukurkite klases Darbuotojas (Employee) ir Klientas (Client), kurios implementuoja Mokėjimas interfeisą.
        Sukurkite masyvą iš keleto darbuotojų ir klientų objektų ir cikle išveskite jų mokėjimo informaciją.

     2 DALIS
        Modifikuokite klasę Klientas (Client), kad joje galima būtų kaupti atliktų mokėjimų sumas (naudokite masyvą).
        1) Atspausdinkite klientus, su kuriais buvo atlikta daugiausia mokėjimų.
        2) Atspausdinkite klientus kurių bent vienas mokėjimas viršija visų mokėjimų vidurkį bent 2 kartus.
 */
public class Main {
    public static void main(String[] args) {

        IPayment[] paymentsInfo = {
                new Employee("Jonas", "LT78912365478", new BigDecimal(100)),
                new Employee("Petras", "LT12345678997", new BigDecimal(200)),
                new Employee("Ona", "LT98765432109", new BigDecimal(300)),
                new Employee("Juozas", "LT32887878741", new BigDecimal(1000)),
                new Client("Client1", "LT98745632179", new BigDecimal(456789)),
                new Client("Client2", "LT98745632178", new BigDecimal(987654)),
                new Client("Client3", "LT98745632177", new BigDecimal(123456)),
                new Client("Client4", "LT98745632176", new BigDecimal(654321))
        };

        for (IPayment p : paymentsInfo) {
            System.out.println(p);
        }


    }
}