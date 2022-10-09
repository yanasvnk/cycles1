public class Main {
    public static void main(String[] args) {

        // Домашнее задание 1
        // Задача 1
        for (int i = 1; i <=10; i++) {
            System.out.println(i);
        }

        // Задача 2
        for (int b = 10; b >=1; b--) {
            System.out.println(b);
        }

        // Задача 3
        for (int c = 0; c <=17; c=c+2 ) {
            System.out.println(c);
        }

        // Задача 4
        for (int d = 10; d >= -10; d--) {
            System.out.println(d);
        }

        // Домашнее задание 2
        // Задача 1
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }

        // Задача 2
        for (int t = 7; t <= 98; t = t +7 ) {
            System.out.println(t);
        }

        // Задача 3
        for (int g = 1; g <= 512; g = g * 2) {
            System.out.println(g);
        }

        // Домашнее задание 3
        // Задача 1
        int savingPerMonth = 29000;
        int total = 0;
        for (int v = 1; v<=12; v++) {
            total = total + savingPerMonth;
            System.out.println("Месяц " + v + " сумма накоплений равна " + total + " рублей");
        }

        // Задача 2
        int savingPerMonth1 = 29000;
        int total1 = 0;
        for (int v1 = 1; v1<=12; v1++) {
            total1 = total1 + total1/100;
            total1 = total1 + savingPerMonth1;
            System.out.println("Месяц " + v1 + " сумма накоплений равна " + total1 + " рублей");
        }
        }
}