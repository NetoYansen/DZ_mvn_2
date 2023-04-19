package ru.netology.javaga.DZ_Java_mvn_2.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaga.DZ_Java_mvn_2.service.CalcService;

public class CalcServiceTest {

    @Test
    void testIn10000ex3000th20000() {
        CalcService service = new CalcService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 3;
        //System.out.println(" 1. " + expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIn100000ex60000th150000() {
        CalcService service = new CalcService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 2;
        //System.out.println(" 2. " + expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }

}

