package by.adamovichhh.laba.task4;

public class PrimeNumbers {

    public void functionOutput() {
        int length = 10;
        int[] digits = new int[length];
        for (int i = 0; i < length; i++) {
            digits[i] = (int) (Math.random() * 20 + 1);
            if (isPrime(digits[i])) {
                System.out.print(i + " ");
            }
        }
    }

    private boolean isPrime(int x) {

        if (x == 1 || x == 2) { return true; }

        int i = 1;
        do {
            i++;
            if (x % i == 0) {
                return false;
            }
        } while ((i < Math.sqrt(x)) || (Math.abs(i - Math.sqrt(x)) < 0.0001));
        return true;
    }

}
