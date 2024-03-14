package org.example;

import java.util.Random;


public class ArrayWork {

    public static int MAX = 201;
    static  int MIN = 100;
    public static int[] generateArray(int lengthArray){
        int[] resultArray = new int[lengthArray];
        Random random = new Random();
        for (int i = 0; i< lengthArray; i++){
            resultArray[i] = random.nextInt(MAX)-MIN;
        }
        return resultArray;
    }

    /**
     * Написать метод, возвращающий количество чётных элементов массива.
     * countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
     * @param checkArray проверяемый массив
     * @return количество четных элементов
     */
    public static int countEvenNumbers (int[] checkArray){
        int countEven = 0;
        for (int number:
             checkArray) {
            if (number%2 == 0){
                countEven++;
            }
        }
        return countEven;
    }

    /**
     * Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами
     * переданного не пустого массива.
     * @param checkArray проверяемый массив
     * @return разница между минимальным и максимальным элементами.
     * Если передан массив нулевой длинны возвращает -1000
     */
    public static int differenceMinMax(int[] checkArray){
        if (checkArray.length != 0){
            int min = checkArray[0], max = checkArray[0];

            for (int number:
                    checkArray) {
                if (number < min) min = number;
                if (number > max) max = number;
            }
            return max-min;
        }
        return -1000;
    }

    /**
     * Написать функцию, возвращающую истину, если в переданном массиве
     * есть два соседних элемента, с нулевым значением
     * @param checkArray проверяемый массив
     * @return результат поиска последовательности из 0 0
     */
    public static boolean checkSeries(int[] checkArray){
        for (int i = 0; i < checkArray.length - 1; i++){
            if (checkArray[i] == 0 && checkArray[i + 1] == 0) return true;
        }
        return false;
    }
}
