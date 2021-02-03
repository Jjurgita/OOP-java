package bit.obj.p12.nested_class_local;

public class Employee {
    String name;
    String number;

    /*
            Klasė gali būti aprašyta ir bet kokio bloko viduje.
            Blokas - tai java sakiniai apgaubti riestiniais skliaustais: { ... }
     */
    public String print() {
        class Phone {
            private String phone;

            private Phone(String phone) {
                this.phone = phone;
            }

            private String print() {
                return phone.substring(0, 1) +
                        "-(" + phone.substring(1, 4) + ")-" +
                        phone.substring(4);
            }
        }
        return this.name + " " + new Phone(this.number).print();
    }
}
