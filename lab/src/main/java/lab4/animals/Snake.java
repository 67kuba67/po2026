package lab4.animals;

public class Snake extends Animal {

    public Snake(String name) {
        this.name = name;
        this.legs = 0;
    }

    @Override
    public String getDescription() {
        return "Wąż " + name + ", nogi: " + legs;
    }
}