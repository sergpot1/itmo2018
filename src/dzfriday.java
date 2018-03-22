import java.sql.SQLOutput;

public class dzfriday {
    public static void main(String[] args) {
        System.out.println("\n1st task");
        double m, n;
        m = 10;
        n = 5;
        if (Math.abs(m - 10.0) > Math.abs(n - 10.0)) {
            System.out.println("The number n = " + n + " is closer to the number 10");
        } else if (Math.abs(m - 10.0) < Math.abs(n - 10.0)) {
            System.out.println("The number m = " + m + " is closer to the number 10");
        } else System.out.println("The numbers are equally close to the number 10");



        System.out.println("\n2nd task");
        double a = 16;
        double b = -8;
        double c = 1;
        double D, x1, x2;
        D = b * b - 4 * a * c;
        if (D > 0) {
            x1 = ((-b) + Math.sqrt(D)) / (2 * a);
            x2 = ((-b) - Math.sqrt(D)) / (2 * a);
            System.out.println("Уравнение имеет 2 корня: x1 = " + x1 + " x2 = " + x2);
            }
            else if (D == 0) {
            x1 = -b / (2 * a);
            System.out.println("Уравнение имеет 1 корень: x = " + x1);
            } else System.out.println("Уравнение не имеет корней");




        System.out.println("\n3d task");
        int num = 608;
        int dig1 = num / 100;
        int dig2 = (num % 100) / 10;
        int dig3 = num % 10;
        int maxDig;
        if ((dig1 > dig2) && (dig1 > dig3)) {
            maxDig = dig1;
        } else if (dig2 > dig3) {
            maxDig = dig2;
        } else maxDig = dig3;
        System.out.println("Максимальная цифра " + maxDig);



        System.out.println("\n4th task");
        int var1 = -3;
        int var2 = 0;
        int var3 = -1;
        int x;
        System.out.println("Начальная последовательность " + var1 + " " + var2 + " " + var3);
        if (var1 > var2) {
            x = var1; var1 = var2; var2 = x;}
        else var1 = var1;
        if (var2 > var3){
            x = var2; var2 = var3; var3 = x;}
        else var2 = var2;
        if (var1 > var2) {
            x = var1; var1 = var2; var2 = x;}
        else var3 = var3;
        System.out.println("Преобразованная последовательность " + var1 + " " + var2 + " " + var3);


        System.out.println("\n5th task");
        int j = 1000;
        do {
            System.out.print(" " + j);
            j += 3;
        } while (j < 10000);



        System.out.println("\n6th task");
        int g = 90;
        do {
            System.out.print(" " + g);
            g -= 5;
        } while (g > 0);




        System.out.println("\n7th task");
        int schet;
        int var4 = 2;
        for(schet = 0; schet < 21; schet++ ){
            var4 = var4 *2;
            System.out.print(var4 + " ");
        }


        System.out.println("\n8th task");
        boolean check = true;
        int number = 29;
        for (int f = 2; number < f ; f++){
            if (number % f == 0) {
                check = false;
                continue;
            }
        }
        if (check) {
            System.out.println("Натуральное число является простым");
        } else System.out.println("Натуральное число является составным");


        System.out.println("\n9th task");
        int n1 = 11;
        int v1, v2;
        v1 = 0;
        v2 = 1;
        int v3;
        int p; //счетчик
        for(p = 1; p < 12 ;p++){
            System.out.print(v2 + " ");
            v3 = v2;
            v2 = v1 + v2;
            v1 = v3;
        }



        System.out.println("\n10th task");
        int t;
        int g1, g2, g3, g4, g5, g6;
        int sum = 0;
        for (t = 000001; t <= 999999; t++){
            g1 = t / 100000;
            g2 = (t / 10000) % 10;
            g3 = (t / 1000) % 10 % 10;
            g4 = (t / 100) % 10 % 10 % 10;
            g5 = (t / 10) % 10 % 10 % 10 % 10;
            g6 = t % 10;
            if (g1 + g2 + g3 == g4 + g5 + g6){
                sum++;
            }
        }
        System.out.println("Всего счастливых билетов из 999999 " + sum);




        System.out.println("\n11th task");
        int summa_ch = 0;
        int o; //schet
        int a1, a2, a3, a4;
        for (o = 0000; o <= 2359 ;o++){
            a1 = o / 1000;
            a2 = (o / 100) % 10;
            a3 = o % 10 % 10;
            a4 = o % 10;
            if (a1 == a4 && a2 == a3){
                summa_ch++;
            }
        }
        System.out.println("Совпадений комбинаций " + summa_ch);

























        }
    }
