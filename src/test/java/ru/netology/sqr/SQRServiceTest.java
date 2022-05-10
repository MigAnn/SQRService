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

        int actual = service.SRQService(200, -100);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
}