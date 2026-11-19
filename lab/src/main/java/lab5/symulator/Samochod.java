package lab5.symulator;

public class Samochod
{
    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;
    private Pozycja pozycja;

    public Samochod(Silnik silnik, SkrzyniaBiegow skrzynia, Pozycja pozycja)
    {
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.pozycja = pozycja;
    }

    public void wlacz()
    {
        silnik.uruchom();
    }

    public void wylacz()
    {
        silnik.zatrzymaj();
        skrzynia.zeruj();
    }

    public static void main(String[] args)
    {
        Silnik silnik = new Silnik("Opel", "2.2");
        Sprzeglo sprzeglo = new Sprzeglo("Sachs", "R5");
        SkrzyniaBiegow skrzynia = new SkrzyniaBiegow("R","28", sprzeglo);
        Pozycja pozycja = new Pozycja();

        Samochod samochod = new Samochod(silnik, skrzynia, pozycja);

        samochod.wlacz();

        sprzeglo.wcisnij();
        skrzynia.zwiekszBieg();
        skrzynia.zwiekszBieg();
        skrzynia.zmniejszBieg();
        sprzeglo.zwolnij();

        pozycja.aktualizujPozycje(10,5);


        System.out.println("silnik: "+ silnik.getProducent() + " " + silnik.getModel() + " " + silnik.getObroty());

        samochod.wylacz();
    }
}