package by.epamtc.lab2.service;

import by.epamtc.lab2.entity.Basket;
import by.epamtc.lab2.entity.Color;

public class BasketTool {
   private Basket basket;

    public BasketTool(Basket basket) {
        this.basket = basket;
    }
    public int countColorBalls(Color color){
        if(basket==null){
            //выбросить своё исключение
        }
        int count=0;
        for (int i = 0; i <basket.getList().size(); i++) {
            if(basket.getList().get(i).getColor()==color){
                count++;
            }
        }
        return count;

    }
}
