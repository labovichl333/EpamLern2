package by.epamtc.lab2.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Basket implements Serializable {
    private double maxWeight;
    private double activeWeight;
    private List<Ball> list;

    public Basket(double maxWeight, List<Ball> list) {
        this.maxWeight = maxWeight;
        this.list = list;
        this.activeWeight=0;
    }

    public Basket() {
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public List<Ball> getList() {
        return list;
    }

    public void setList(List<Ball> list) {
        this.list = list;
    }

    public double getActiveWeight() {
        return activeWeight;
    }

    public void addBall(Ball ball){
        if(ball==null){
            //Здесь должно быть выброшено  своё исключение
        }
        if(activeWeight+ball.getWeight()<=maxWeight){
            activeWeight+=ball.getWeight();
            list.add(ball);
        }else {
            //Здесь должно быть выброшено  своё исключение
            System.out.println("waerdgfhjbvgbc");
        }
    }

    public boolean removeBall(Ball ball){
        if(ball==null){
            //Здесь должно быть выброшено  своё исключение
        }
        activeWeight-=ball.getWeight();
        list.remove(ball);
        return false;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "maxWeight=" + maxWeight +
                ", activeWeight=" + activeWeight +
                ", list=" + list +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Double.compare(basket.maxWeight, maxWeight) == 0 &&
                Double.compare(basket.activeWeight, activeWeight) == 0 &&
                Objects.equals(list, basket.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxWeight, activeWeight, list);
    }
}
