package by.adamovichhh.laba.task1;

public class FunctionCounter {

    private Double countFunction(double x, double y) {
        return ((1 + Math.sin(x + y) * Math.sin(x + y)) / (2 + Math.abs(x - 2 * x / (1 + x * x * y * y)))) + x;
    }

    public void functionOutput() {
        int length = 10;
        double[] x = new double[length];
        double[] y = new double[length];
        for (int i = 0; i < length; i++) {
            x[i] = Math.random();
            y[i] = Math.random();
            System.out.println(countFunction(x[i],y[i]));
        }
    }

}
