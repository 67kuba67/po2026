package lab4.animals;

public class Dog extends Animal
{

    public Dog(String name)
    {
        this.name = name;
        this.legs = 4;
    }

    @Override
    public String getDescription()
    {
        return "pies" + name + "nogi:" + legs;
    }
}