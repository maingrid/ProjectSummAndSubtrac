package org.example;



public class Calc {

    public int summ(int a, int b){
        int result;
        result = a + b;
        System.out.printf("Сумма двух чисел %d и %d равна %d\n", a, b, result);
        return result;
    }
    public int subtraction(int a, int b){
        int result;
        result = a - b;
        System.out.printf("Результат вычитания двух чисел %d и %d равен %d\n", a, b, result);
        return result;
    }
}
