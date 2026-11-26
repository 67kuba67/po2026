package lab5.symulator;

public class Pozycja
{
        private double x;
        private double y;

        public Pozycja()
        {
            this(0, 0);
        }

        public Pozycja(double x, double y)
        {
            this.x = x;
            this.y = y;
        }

        public void aktualizujPozycje(double deltaX, double deltaY)
        {
            x = x + deltaX;
            y = y + deltaY;
        }

        public void przemiesc(double dt, double v, Pozycja cel)
        {
            if (cel == null || dt <= 0 || v <= 0)
            {
                return;
            }

            double odleglosc = Math.sqrt(Math.pow(cel.x - x, 2)+Math.pow(cel.y - y, 2));

            if (odleglosc == 0)
            {
                return;
            }

            double dx = v * dt * (cel.x - x) / odleglosc;
            double dy = v * dt * (cel.y - y) / odleglosc;

            x = x + dx;
            y = y + dy;
        }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public String getPozycja()
    {
        return x + ", " + y;
    }


}