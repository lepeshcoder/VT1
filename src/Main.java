import by.adamovichhh.laba.task1.FunctionCounter;
import by.adamovichhh.laba.task2.Points;
import by.adamovichhh.laba.task3.TgCounter;
import by.adamovichhh.laba.task4.PrimeNumbers;
import by.adamovichhh.laba.task5.IncreasingSubsequence;
import by.adamovichhh.laba.task6.Matrix;
import by.adamovichhh.laba.task7.ShellSort;
import by.adamovichhh.laba.task8.Sequences;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task1 'Подсчитать значение функции':");
        new FunctionCounter().functionOutput();

        System.out.println("\nTask2 'Принадлежит ли точка области?':");
        new Points().functionOutput();

        System.out.println("\nTask3 'Подсчитать значение тангенса на промежутке':");
        new TgCounter().functionOutput();

        System.out.println("\nTask4 'Есть ли среди элементов массива простые числа?':");
        new PrimeNumbers().functionOutput();

        System.out.println("\nTask5 'Найти наименьшее число K элементов, которые можно\n" +
                "выкинуть из данной последовательности, так чтобы осталась возрастающая\n" +
                "подпоследовательность.':");
        new IncreasingSubsequence().functionOutput();

        System.out.println("\nTask6 'Квадратная матрица порядка n':");
        new Matrix().functionOutput();

        System.out.println("\nTask7 'Сортировка Шелла':");
        new ShellSort().functionOutput();

        System.out.println("\nTask8 'Создание возврастающей последовательности':");
        new Sequences().functionOutput();
    }
}