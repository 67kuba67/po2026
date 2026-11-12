package lab4.animals;

public abstract class Animal
{
    protected String name;
    protected int legs;

    public String getName()
    {
        return name;
    }

    public int getLegs()
    {
        return legs;
    }

    public abstract String getDescription();
}