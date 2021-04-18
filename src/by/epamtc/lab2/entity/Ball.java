package by.epamtc.lab2.entity;

import java.io.Serializable;

public class Ball implements Serializable {
    public final Color DEFAULT_COLOR=Color.ORANGE;
    public final double DEFAULT_WEIGHT=10;
    private double weight;
    private Color color;

    public Ball(double weight, Color color) {
        this.weight = weight;
        this.color = color;
    }
    public Ball() {
        this.weight = DEFAULT_WEIGHT;
        this.color = DEFAULT_COLOR;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "@" +
                "weight: " + weight +
                ", color: " + color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Double.compare(ball.weight, weight) == 0 &&
                color == ball.color;
    }

    @Override
    public int hashCode() {
        int result = 19;
        result = 31 * result + (int) Double.doubleToLongBits(weight);
        result = 31 * result + color.hashCode();
        return result;
    }
}
