package lab5.symulator;

public class Sprzeglo extends Komponent
{
    private boolean stanSprzegla;

    public Sprzeglo(String producent, String model)
    {
        super(producent, model);
        this.stanSprzegla = false;
    }

    public void wcisnij()
    {
        stanSprzegla = true;
        System.out.println("sprzeglo wcisniete");
    }

    public void zwolnij()
    {
        stanSprzegla = false;
        System.out.println("sprzeglo puszczone");
    }

    public boolean getStanSprzegla()
    {
        return stanSprzegla;
    }

}
