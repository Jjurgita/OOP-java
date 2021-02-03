package bit.obj.p12.nested_class_not_static;

import java.math.BigDecimal;

public class Employee {
    String name;
    Position position;

    /*
            Paprastos (ne statinės) vidinės klasės turi priėjimą prie išorinės klasės laukų ir metodų net jei jie yra privatūs,
            t.y. vidinės klasės metodai turi tokias pat teises kaip ir išorinės klasės metodai.
            Jei iš vidinės klasės norime prieiti prie išorinės klasės laukų ar metodų, tai reikia naudoti konstrukcją:
                    Išorinė-klasė.this.išorinės-klasės-laukas-ar-metodas
                    pvz.:
                    ClassA.this.methodA()
                    ClassA.this.fieldB = 3;
     */
    class Position {

        public String position;
        public BigDecimal salary;

        public String print() {
            return Employee.this.name + " salary " + this.salary + "€/h"  ;
        }

    }
}
