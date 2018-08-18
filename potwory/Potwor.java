package dziedziczenie.potwory;

public class Potwor {
    double predkoscChodzenia = 10;
    double zywotnosc =100;
    void atakuj()
    {
        System.out.println("To jest metoda atakuj z klasy Potwor.");
    }
    public Potwor()
    {
        System.out.println("Domyslny kontruktor z klasy Potwor.1");
    }
    public Potwor(double predkoscChodzenia,double zywotnosc)
    {
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
        System.out.println("Nie domyslny konstruktor z klasy Potwór.");
    }
}
