package patterns.Strategy;

public class Subtraction implements Strategy{
    @Override
    public float calculation(float value1, float value2) {
        return value1 - value2;
    }
}
