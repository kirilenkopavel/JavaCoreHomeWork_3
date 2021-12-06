package Lesson_3;

public abstract class Apple extends Fruit {
    private float weight = 1.0f;
    protected String name = " Apple ";

    public Apple(String name, float weight) {
        super(name, weight);
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
