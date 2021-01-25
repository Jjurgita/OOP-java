package bit.obj.p06.notes.prat2;

public class Human {
    // KLASES PASIEKIAMUMO KONTROLE
    /*
    klases pasiekima galima kontroliuoti pries ja prirase/neprirase tam tikrus zodzius:
    - nieko nenurodyta reiskia, kad klase prieinama tik is einamo paketo
    - public (laukai ir metodai yra viesi ir pasiekiami is visur)
    - private (pasiekiama tik is ju klases)
    - protected (pasiekiami tik tame paciame pakete esanciu klasiu, taip pat is duotos klases dukteriniu klasiu)
     */

    //Sukurti Human klasę taip, kad Human vardo ir pavardės po sukūrimo nebūtų galima keisti.

    private String firstname;
    private String lastname;

    Human (String firstname) {
        this.firstname = firstname;
    }

    Human (String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    String fullName(){
        return firstname + (lastname == null ? "" : ' ' + lastname);
    }
}
