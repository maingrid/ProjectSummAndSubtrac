package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {


    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0"})
    @DisplayName("Проверка суммирования ")
    @Tag("summ")
    void summ3(int a, int b, int expectedResult) {
        Calc calculator  = new Calc();
        int result = calculator.summ(a,b);
        Assertions.assertEquals(expectedResult, result, "Результат не верный");
    }

    @ParameterizedTest(name = "#{index} - вычитание {0} и {1}, ожидаем {2}")
    @CsvSource({"2, 1, 1", "-15, 7, -22", "32, 15, 17"})
    @DisplayName("Проверка вычитания")
    @Tag("subtrac")
    void subtrac(int a, int b, int expectedResult){
        Calc calculator = new Calc();
        int result = calculator.subtraction(a, b);
        Assertions.assertEquals(expectedResult, result, "результат не верный");
    }
}