package by.adamovichhh.laba.task5;
import java.util.Arrays;
import java.util.Random;

public class IncreasingSubsequence {

    public int CounterOfMinElements(int[] arr) {
        int temp;
        int result = 0;

        temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < temp) {
                result++;
            } else {
                temp = arr[i];
            }
        }
        return result;
    }

    public void functionOutput() {

        Random random = new Random();
        int n = random.nextInt(10, 30);
        int[] arrayMain = new int[n];
        for (int i = 0; i < arrayMain.length; i++) {
            arrayMain[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(arrayMain));
        System.out.println(CounterOfMinElements(arrayMain));
    }

}
