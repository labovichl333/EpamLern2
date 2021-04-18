package by.epamtc.lab2.run;

import by.epamtc.lab2.entity.Ball;
import by.epamtc.lab2.entity.Basket;
import by.epamtc.lab2.service.BasketTool;
import by.epamtc.lab2.entity.Color;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {
        Basket basket=new Basket(156.9,new LinkedList<>());
        basket.addBall(new Ball(15.3, Color.BLUE));
        basket.addBall(new Ball(19.3, Color.GREEN));
        basket.addBall(new Ball(15.7, Color.BLUE));
        basket.addBall(new Ball(15.3, Color.ORANGE));
        basket.addBall(new Ball(12.3, Color.PINK));
        basket.addBall(new Ball(12.7, Color.BLUE));
        basket.addBall(new Ball(19.6, Color.YELLOW));
        
        BasketTool basketTool=new BasketTool(basket);
        int countBlue=basketTool.countColorBalls(Color.BLUE);
        System.out.println("Число синих мячей в корзине "+countBlue);
        double weight=basket.getCurrentWeight();
        System.out.println("Вес содержимого корзины "+weight);
        System.out.println(basket.toString());
    }
}
