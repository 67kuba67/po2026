package lab2;
import java.util.Random;
import java.util.ArrayList;

public class lotto
{
    public static void main(String[] args)
    {
        ArrayList<Integer> typy = new ArrayList<>();
        for (String tekst : args)
        {
            typy.add(Integer.parseInt(tekst));
        }

        ArrayList<Integer> liczby = new ArrayList<>();
        Random r = new Random();



        int trafienie = 0;
        long losowania = 0;
        long start = System.currentTimeMillis();

        while (trafienie < 6) {
            liczby = new ArrayList<>();
            trafienie = 0;

            while (liczby.size() < 6) {

                int wylosowana = r.nextInt(49) + 1;

                if (!liczby.contains(wylosowana)) {
                    liczby.add(wylosowana);
                }
            }

            for (int typ : typy) {
                if (liczby.contains(typ)) {
                    trafienie++;
                }
            }

            losowania++;

        }
        long koniec = System.currentTimeMillis();

        System.out.println("typy: " + typy);
        System.out.println("wylosowane: " + liczby);
        System.out.println("losowania: " + losowania);
        System.out.println("czas: " + (koniec - start) + " ms");
    }

}
