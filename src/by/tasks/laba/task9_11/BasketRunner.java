package by.adamovichhh.laba.task9_11;

import java.util.List;

public class BasketRunner {
    public static void main(String[] args) {
        Basket basket = new Basket(50);
        List<Ball> balls = List.of(
                new Ball(2,"blue"),
                new Ball(4,"white"),
                new Ball(12,"white"),
                new Ball(6,"BLUE"),
                new Ball(1,"black"),
                new Ball(7,"blue"));

        basket.setBalls(balls);
        getWeightAndQuantity(basket);
    }

    private static void getWeightAndQuantity(Basket basket) {
        double weight = 0;
        int quantity = 0;
        for (var ball : basket.getBalls()) {
            weight += ball.getWeight();
            if (ball.getColor().equalsIgnoreCase("blue")) {
                quantity++;
            }
        }
        System.out.println("weight = " + weight + "\nblue balls quantity = " + quantity);
    }
}
