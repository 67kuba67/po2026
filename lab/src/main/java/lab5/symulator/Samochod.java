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

        try
        {
            sprzeglo.wcisnij();
            skrzynia.zwiekszBieg();
            skrzynia.zwiekszBieg();
            skrzynia.zmniejszBieg();
            sprzeglo.zwolnij();

            skrzynia.zwiekszBieg();
        }
        catch (Exception e)
            {
                System.out.println("blad: " + e.getMessage());
            }

        Pozycja cel = new Pozycja(10,5);
        pozycja.przemiesc(0.1, 20, cel);
        System.out.println(pozycja.getPozycja());


        System.out.println("silnik: "+ silnik.getProducent() + " " + silnik.getModel() + " " + silnik.getObroty());
        System.out.println("bieg: "+ skrzynia.getAktualnyBieg());
        System.out.println("sprzeglo wcisniete: "+ sprzeglo.getStanSprzegla());
        System.out.println("pozycja: "+ pozycja.getPozycja());

        samochod.wylacz();
    }
}