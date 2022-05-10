package ru.netology.sqr;

public class SQRService {

    public static void main(String[] args) {

        MathService service = new MathService();
        int limit = service.SRQService(200, 300);
        System.out.println(limit);
    }
}