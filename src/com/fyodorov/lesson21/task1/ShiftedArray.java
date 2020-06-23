package com.fyodorov.lesson21.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Класс {@code ShiftedArray} имеет ряд методов для работы с данными двумерного целочисленного массива,
 * при этом массив может быть несимметричным (т.е. строки могут быть разно длины)
 * @author Alexandr Fyodorov
 */
public class ShiftedArray {

    private ShiftedArray() {}

    /**
     * Метод инициализирует двумерный целочисленный массив (может быть несимметричным).
     * При этом нужно задать количество элементов для каждой строки.
     * @param twoDimensionalArray содержит двумерный целочисленный массив.
     */
    public static void initializeTwoDimensionalArray(int[][] twoDimensionalArray) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < twoDimensionalArray.length; i++) {
                System.out.println("Количество элементов "+i + 1+" строки двумерного целочисленного массива: ");
                int elementsCount = Integer.parseInt(br.readLine());
                twoDimensionalArray[i] = new int[elementsCount];

                for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                    System.out.println(j + 1+ " элемент " +i + 1+ " строки (целое число):");
                    int arrayElement = Integer.parseInt(br.readLine());
                    twoDimensionalArray[i][j] = arrayElement;
                }
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /**
     * Метод проходит по значениям каждо строки двумерного целочисленного массива,
     * сдвигая значения строк влево на один индекс. Последнему элементу массива присваивается ноль.
     * @param twoDimensionalArray содержит двумерный целочисленный массив.
     */
    public static void shiftTwoDimensionalArray(int[][] twoDimensionalArray) {
        try {
            for (int i = 0; i < twoDimensionalArray.length; i++) {
                for (int j = 0; j < twoDimensionalArray[i].length - 1; j++) {
                    twoDimensionalArray[i][j] = twoDimensionalArray[i][j + 1];
                    if (j == twoDimensionalArray[i].length - 2) {
                        twoDimensionalArray[i][j + 1] = 0;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /**
     * Метод выводит построчно элементы двумерного целочисленного массива.
     * @param twoDimensionalArray содержит двумерный целочисленный массив.
     */
    public static void printTwoDimensionalArray(int[][] twoDimensionalArray) {
        try {
            StringBuilder arrayLine = new StringBuilder();

            for (int[] line : twoDimensionalArray) {
                for (int i : line) {
                    arrayLine.append(i).append('\t');
                }
                System.out.println(arrayLine);
                arrayLine.setLength(0);
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
