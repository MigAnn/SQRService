package ru.netology.sqr;

public class SQRService {

    public static void main(String[] args) {

        MathService service = new MathService();
        int limits = service.SRQService(200, 300);
        System.out.println(limits);

        MathService service1 = new MathService();
        int limits1 = service1.SRQService(490, 770);
        System.out.println(limits1);

        MathService service2 = new MathService();
        int limits2 = service2.SRQService(5_000, 8_396);
        System.out.println(limits2);
    }
}