package lab2;
import java.util.Random;
import java.util.ArrayList;

public class lotto {
    public static void main(String[] args)
    {
        ArrayList<Integer> liczby = new ArrayList<>();
        Random r = new Random();

        while (liczby.size() < 6) {

            int wylosowana = r.nextInt(49) + 1;

            if (!liczby.contains(wylosowana))
            {
                liczby.add(wylosowana);
            }

        }

        System.out.println(liczby);

    }

}
