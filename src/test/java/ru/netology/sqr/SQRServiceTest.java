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
        MathService service = new MathService();

        int actual = service.SRQService(-100, -300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void test2() {
        MathService service = new MathService();

        int actual = service.SRQService(5_000, -3_948);
        int expected = 899;

        Assertions.assertEquals(expected, actual);
    }
}