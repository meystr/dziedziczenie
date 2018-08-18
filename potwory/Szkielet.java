package dziedziczenie.potwory;

public class Szkielet extends Potwor{
    public Szkielet()
    {
        System.out.println("Domyslny konstruktor z klasy Szkielet.");
    }
    public Szkielet(double predkoscChodzenia, double zywotnosc)
    {
        super(predkoscChodzenia, zywotnosc);

    }
    @Override
    public void atakuj() {
        System.out.println("To jest metoda atakuj z klasy szkielet.");
    }
}
