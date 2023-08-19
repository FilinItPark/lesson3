import java.util.Random;
import java.util.Scanner;

/**
 * @author 1ommy
 * @version 17.08.2023
 */
public class Main {
    public static void main(String[] args) {

/*

        System.out.println("Привет! Я игрулька угадай число");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи нижнюю границу диапазона загадываемых чисел");
        int start = scanner.nextInt();
        System.out.println("Введи верхнюю границу диапазона загадываемых чисел");
        int end = scanner.nextInt();

        String message = String.format("Я загадал число в диапазоне от %d до %d.Попробуй угадать его!", start, end);
        System.out.println(message);
        Random random = new Random();
        int computerNumber = random.nextInt(start, end + 1);
        int userNumber = -10000000;


        do {
            userNumber = scanner.nextInt();

            if (userNumber < computerNumber) {
                System.out.println("Я загадал число больше");
            } else if (userNumber > computerNumber) {
                System.out.println("Я загадал число меньше");
            } else {
                System.out.println("Ура!ты отгадал число");
            }
        } while (userNumber != computerNumber);
*/


        // есть диапазон чисел от [125000, 3125000]. нам нужно найти все числа,у которых есть ровно 4 различных делителя

//        int countOfGoodNumbers = 0;
//        for (int i = 125000; i < 3125000; i++) {
//            int count = 2; // количество делителей числа
//
//            for (int j = 2; j <= (int) Math.sqrt(i); j++) {
//                if (i % j == 0) { // проверяем, что число j - делитель числа i
//
//                    if (j * j == i) { // является j - квадратный корнем числа i
//                        count += 1;
//                    } else {
//                        if (i % (i / j) == 0) { // проверяем, что, число i/j - тоже делитель i
//                            count += 1;
//                        }
//                        count++;
//                    }
//                }
//                if (count > 4) break;
//            }
//            if (count == 4) countOfGoodNumbers++;
//        }
//        System.out.println(countOfGoodNumbers);

//        for (int i = 100; i >= 0; i--) {
//            System.out.println(i);
//        }
/*        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи размер массива");
        int arraySize = scanner.nextInt();
        System.out.println("Введи элементы массива");
        int[] array = new int[arraySize];


        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        */
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Cколько у вас есть денег?");
        int myMoney = scanner.nextInt();

        int[] prices = new int[6];

        Random random = new Random();

        for (int i = 0; i < prices.length; i++) {
            prices[i] = random.nextInt(1, 100);
            System.out.println(prices[i]);
        }

        int sumPrices = 0;
        for (int i = 0; i < prices.length; i++) {
            sumPrices += prices[i];
        }

        if (myMoney >= sumPrices) {
            System.out.println("Ты можешь скупить все продукты в магазине");
        } else {
            System.out.println("У тебя не хватает денег, увы, ты можешь купить только часть");
        }*/

        // друзья мои, прекрасен наш союз
        String[] words = new String[5];
        words[0] = "друзья";
        words[1] = "мои,";
        words[2] = "прекрасен";
        words[3] = "наш";
        words[4] = "союз";

        String sentence = "";
        for (int i = 0; i < words.length; i++) {
            sentence += words[i] + " ";
        }
        System.out.println(sentence);

//        int[] numbers = new int[6];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        numbers[3] = 4;
//        numbers[4] = 5;
//            System.out.println(numbers[i]);
//        }

//        String helloWorld = "Hello world";
    }
}