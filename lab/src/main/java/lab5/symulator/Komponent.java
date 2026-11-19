package lab5.symulator;

public class Komponent
{
    private String producent;
    private String model;

    public Komponent(String producent, String model)
    {
        this.producent = producent;
        this.model = model;
    }

    public String getProducent()
    {
        return producent;
    }

    public String getModel()
    {
        return model;
    }

    public static void main(String[] args)
    {
        Silnik silnik = new Silnik("Opel", "2.2");
        Sprzeglo sprzeglo = new Sprzeglo()



    }


}
