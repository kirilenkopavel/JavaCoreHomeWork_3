package Lesson_3;

public abstract class Orange extends Fruit {
    private float weight = 1.5f;
    protected String name = " Orange ";

    public Orange(String name, float weight) {
        super(name, weight);
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
