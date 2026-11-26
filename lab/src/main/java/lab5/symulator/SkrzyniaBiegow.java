package lab5.symulator;

public class SkrzyniaBiegow extends Komponent
{
    private final int iloscBiegow = 5;
    private int aktualnyBieg;
    private Sprzeglo sprzeglo;

    public SkrzyniaBiegow(String producent, String model, Sprzeglo sprzeglo )
    {
        super(producent, model);
        this.aktualnyBieg = 0;
        this.sprzeglo = sprzeglo;
    }

    public void zwiekszBieg() throws Exception
    {
        if(!getSprzeglo().getStanSprzegla())
        {
            throw new Exception("nie wcisniete sprzeglo");
        }
        if(aktualnyBieg<iloscBiegow)
        {
            aktualnyBieg++;
        }
        System.out.println("bieg="+aktualnyBieg);
    }
    public void zmniejszBieg() throws Exception
    {
        if(!getSprzeglo().getStanSprzegla())
        {
            throw new Exception("nie wcisniete sprzeglo");
        }

        if(aktualnyBieg>0)
        {
            aktualnyBieg--;
        }
        System.out.println("bieg="+aktualnyBieg);
    }
    public void zeruj()
    {
        aktualnyBieg =0;
        System.out.println("bieg="+aktualnyBieg);
    }

    public int getAktualnyBieg()
    {
        return aktualnyBieg;
    }

    public Sprzeglo getSprzeglo()
    {
        return sprzeglo;
    }

}
