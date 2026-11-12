package lab4.zadania;

import lab4.animals.Animal;
import lab4.animals.Dog;
import lab4.animals.Parrot;
import lab4.animals.Snake;

import java.util.Random;

public class Zoo
{
    Animal[] animals = new Animal[100];

    public void wypelnienie()
    {
        Random random = new Random();
        for (int i = 0; i < 100; i++)
        {
            int los = random.nextInt(3);

            if (los == 0)
            {
                animals[i] = new Parrot("papuga" + i);
            }
            else if (los == 1)
            {
                animals[i] = new Dog("pies" + i);
            }
            else
            {
                animals[i] = new Snake("was" + i);
            }
        }
    }

    public int sumanog()
    {
        int suma = 0;
        for (Animal animal : animals)
        {
            suma = suma + animal.getLegs();
        }
        return suma;
    }

    public static void main(String[] args)
    {
        Zoo zoo = new Zoo();
        zoo.wypelnienie();
        for (Animal animal : zoo.animals)
        {
            System.out.println(animal.getDescription());
        }
        System.out.println("suma nog:" + zoo.sumanog());
    }
}