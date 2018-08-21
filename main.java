package com.company;

import java.util.Arrays;  //для работы с массивами
import java.util.Scanner;  //для считывания ввода

class main  //объявляем класс
{
    public static float getMedianOfNumber(int[] arrayForFindingTheMedianOfNumber)  //метод для нахождения медианы чисел, параметром является массив
    {
        Arrays.sort(arrayForFindingTheMedianOfNumber);  //сортируем полученный массив по возрастанию
        return ((arrayForFindingTheMedianOfNumber[arrayForFindingTheMedianOfNumber.length / 2] + arrayForFindingTheMedianOfNumber[arrayForFindingTheMedianOfNumber.length / 2 - 1]) / 2f);
    }

    public static void main(String[] args)  //основной метод программы
    {
        Scanner input = new Scanner(System.in);  //создаём "магию" ввода
        int size =6;
        int[] arrayNumber = new int[size];  //создаём целочисленный массив длиной равной количеству элементов
        for (int i = 0; i < size; i++)  //циклом заполняем все элементы массива
        {
            System.out.print("Введите значение: ");  //просим ввести
            arrayNumber[i] = input.nextInt();  //пользователь вводит
        }

        System.out.println("\nМедиана: " + getMedianOfNumber(arrayNumber));  //показываем медиану массива

    }
}
