package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test

    public void test() {
        MathService service = new MathService();

        int actual = service.SRQService(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void test1() {
        MathService service1 = new MathService();

        int actual = service1.SRQService(490, 770);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void test2() {
        MathService service2 = new MathService();

        int actual = service2.SRQService(5_000, 8_396);
        int expected = 21;

        Assertions.assertEquals(expected, actual);
    }
}