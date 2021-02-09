package bit.obj.p14.enum_notes;
/*
        ENUM - duomenų tipas, kai galima įgyti reikšmes tik iš nurodyto sąrašo.

        enum NEGALIMA praplėsti - pagal nutylėjimą ji yra kaip final
        enum GALIMA nurodyti savo konstruktorių, papildomus laukus ir metodus
        (demo2 package)
 */
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Color color = Math.random() < 0.25 ? Color.Black : Color.White;

            if (color == Color.White && Math.random() < 0.5) {
                color = Color.Red;
            }
            System.out.println(color);
        }
    }
}
