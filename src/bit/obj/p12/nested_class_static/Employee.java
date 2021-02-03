package bit.obj.p12.nested_class_static;

import java.math.BigDecimal;

public class Employee {
    static String CompanyName;
    String name;
    Position position;

    /*
           VIDINĖ KLASĖ
           Java galima aprašyti klasę kitos klasės viduje.
           Tokios vidinės klasės gali būti dviejų tipų - statinės (pažymėtos static) ir ne.
           Iš statinės vidinės klasės negalima prieiti prie paprastų išorinės klasės metodų, tik prie statinių.
           Tokia vidinė statinė klasė iš išorės prieinama per išorinę klasę:
                    šorinė-klasė.vidinė-klasė
                    pvz.: ClassA.InnerClassB a = new ClassA.InnerClassB()
     */
    protected static class Position {
        public String position;
        public BigDecimal salary;

        public String print() {
            return Employee.CompanyName + " " + this.salary;
        }
    }
}
