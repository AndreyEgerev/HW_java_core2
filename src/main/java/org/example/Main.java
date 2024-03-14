package org.example;

import java.util.Arrays;
/*
1. Написать метод, возвращающий количество чётных элементов массива.
countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
2. Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами
переданного не пустого массива.
3. Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
*/
public class Main {
    public static void main(String[] args) {
        // генерация массива
        int arrayLength = 10;
        int[] testArray= ArrayWork.generateArray(arrayLength);
        int[] test2 = {1,4,0,0,5,6,2,};
        int[] test3 = {1,1,1,1,1};
        int[] test4 = new int[0];

        //вывод массива
        System.out.println(Arrays.toString(testArray));

        // работа с массивом
        System.out.print("Количество четных чисел в массиве - ");
        System.out.println(ArrayWork.countEvenNumbers(testArray));

        if (ArrayWork.differenceMinMax(testArray) != -1000){
            System.out.println("Разница между максимальным и минимальным элементами массива - ");
            System.out.println(ArrayWork.differenceMinMax(testArray));
        }else System.out.println("Передан пустой массив");


        if (ArrayWork.checkSeries(testArray)){
            System.out.println("Последовательность 0,0 найдена");
        }
        else {
            System.out.println("Последовательность 0,0 не найдена");
        }
    }
}