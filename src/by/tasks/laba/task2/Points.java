package by.adamovichhh.laba.task2;

public class Points {

    private boolean isPointInSquare(double x, double y) {
        if (x >= -4 && x <= 4 && y >= 0 && y <= 4) return true;
        if (x >= -6 && x <= 6 && y >= -3 && y <= 0) return true;
        return false;
    }

    public void functionOutput() {
        int length = 10;
        double[] x = new double[length];
        double[] y = new double[length];
        for (int i = 0; i < length; i++) {
            x[i] = Math.random()*10 - 5;
            y[i] = Math.random()*10 - 5;
            System.out.println(isPointInSquare(x[i],y[i]) + " " + x[i] + " " + y[i]);
        }
    }

}
