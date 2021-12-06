package Lesson_3;

public abstract class Fruit {
    private String name;
    private float weight;

    public Fruit(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public abstract float getWeight();

    public abstract boolean getName();
}
