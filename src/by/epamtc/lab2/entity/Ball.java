package by.epamtc.lab2.entity;

import by.epamtc.lab2.util.Color;

import java.io.Serializable;
import java.util.Objects;

public class Ball implements Serializable {
    private double weight;
    private Color color;

    public Ball(double weight, Color color) {
        this.weight = weight;
        this.color = color;
    }
    public Ball() {
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
        return "Ball{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
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
        return Objects.hash(weight, color);
    }
}
