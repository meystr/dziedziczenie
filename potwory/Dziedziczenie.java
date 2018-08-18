package dziedziczenie.potwory;

public class Dziedziczenie {

    public static void main(String[] args) {
    Potwor potwor = new Potwor(10, 100);
    Szkielet szkielet = new Szkielet();
    Zombie zombie = new Zombie();
    szkielet.atakuj();
    }
}
