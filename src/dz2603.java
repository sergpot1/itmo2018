import java.util.Arrays;
import java.util.Scanner;

public class dz2603 {
    public static void main(String[] args){

        System.out.println("\n1st task");
        int arr1[] = new int[9];
        for(int i = 0, a = 2; i < arr1.length; i++, a += 2){
            arr1[i] = a;
            System.out.print("\n" + arr1[i]);
        }
        System.out.println("\n\n" + Arrays.toString(arr1));



        System.out.println("\n2nd task");

        int k=0;
        for(int i=1; i<99; i++){
            if(i%2 != 0) k++;
        }

        int arr2[] = new int[k];

        for(int i = 0, a = 1; i < arr2.length; i++, a += 2){
            arr2[i] = a;
        }
        System.out.println(Arrays.toString(arr2));

        for(int i = 0, a = 97; i < arr2.length; i++, a -= 2){
            arr2[i] = a;
        }
        System.out.println(Arrays.toString(arr2));


        System.out.println("\n3d task");
        int sum = 0;
        int arr3[] = new int [15];

        for (int i =0; i < arr3.length ;i++){
            arr3[i] = (int) (Math.random() * 10);
            if (arr3[i] % 2 == 0){
                sum++;
            }
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println("всего четных элементов " + sum);



        System.out.println("\n4th task");
        int arr4[] = new int [5];
        int arr5[] = new int [5];
        double sum4 = 0, sum5 = 0;

        for (int i =0; i < arr4.length ;i++){
            arr4[i] = (int) (Math.random() * 6);
            sum4 = sum4 + arr4 [i];
        }
        for (int i =0; i < arr5.length ;i++){
            arr5[i] = (int) (Math.random() * 6);
            sum5 = sum5 + arr5 [i];
        }
        System.out.println("1 массив: " + Arrays.toString(arr4));
        System.out.println("2 массив: " + Arrays.toString(arr5));
        if (sum4 / 5 == sum5 / 5){
            System.out.println("Среднее арифметическое 1го массива " + sum4 / 5 + " = " + sum5 / 5 + " среднему арифметическому 2го массива");
        } else if (sum4 / 5 > sum5 / 5) {
            System.out.println("Среднее арифметическое 1го массива " + sum4 / 5 + " > " + sum5 / 5 + " среднего арифметического 2го массива");
        } else System.out.println("Среднее арифметическое 1го массива " + sum4 / 5 + " < " + sum5 / 5 + " среднего арифметического 2го массива");




        System.out.println("\n5th task");
        int arr6[] = new int [4];

        for (int i = 0; i < arr6.length ;i++) {
            arr6[i] = (int) (10 + Math.random() * (90));
        }
        System.out.println(Arrays.toString(arr6));

        for (int i = 0; i < arr6.length; i++){
            if (i>0){
                if (arr6[i-1] >= arr6[i]) {
                    System.out.println("Последовательность в массиве не явлется возрастающей");
                    break;
                }
            }
            if (i == arr6.length - 1){
                System.out.println("Последовательность в массиве строго возрастающая");
            }
        }


        System.out.println("\n6th task");
        int p;
        int right = 0, left = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите четное число");

        while (!scn.hasNextInt()){
            System.out.println("Введено неверное значение. Введите четное положительное число");
            scn.next();}
        if (scn.hasNextInt()) {
            do {
                p = scn.nextInt();
                if (p % 2 != 0 || p < 1) {
                    System.out.println("Ошибка, введите четное число.");
                }
            } while (p % 2 != 0 || p < 1);

            int arr7[] = new int[p];
            for (int i = 0; i < arr7.length; i++) {
                arr7[i] = (int) (-5 + (Math.random() * (5 - (-5)) + 1));
                System.out.print(arr7[i] + " ");
                if (i <= (arr7.length - 1) / 2){
                    left = left + Math.abs(arr7[i]);
                } else {
                    right = right + Math.abs(arr7[i]);
                }
                if (i == arr7.length - 1) {
                    if (left > right){
                        System.out.println("Сумма модулей левой части больше правой");
                    }
                    if (left == right) {
                        System.out.println("Сумма модулей левой части равна правой");
                    }
                    if (left < right){
                        System.out.println("Сумма модулей левой части меньше правой");
                    }
                }
            }
        } else System.out.println("Введено не число");



        System.out.println("\n7th task");
        int [][] arr7 = new int[5][8];
        for(int i = 0; i < arr7.length; i++) {
            for (int j = 0; j < arr7[i].length; j++) {
                arr7[i][j] = (int) ((Math.random() * 199) - 99);
                System.out.print(arr7[i][j] + " ");
            }
        }
        int min = arr7 [0][0];
        for(int i = 0; i < arr7.length; i++) {
            for (int j = 0; j < arr7[i].length; j++) {
                if (arr7[i][j] > min) min = arr7[i][j];
            }
        }
        System.out.print("\n");
        System.out.println("Значение максимального элемента массива равно: " + min);


        System.out.println("\n8th task");

        int [][] arr8 = new int[15][3];
        for(int i = 0; i < arr8.length; i++){
            for(int j = 0; j < arr8[i].length; j++){
                arr8[i][j]=(int)(Math.random() * 8) + 2;
                if(j == arr8[i].length - 1){
                    arr8[i][j] = arr8[i][j - 2] * arr8[i][j - 1];
                    for (int a = 0; a < i; a++){
                        if(arr8[i][j] == arr8[a][j] && i > 0){
                            if(arr8[i][j - 1] == arr8[a][j - 1] || arr8[i][j-2] == arr8[a][j - 2])
                                --i;
                        }
                    }
                }
            }
        }
        for(int i=0; i < arr8.length; i++){
            System.out.print("Задание №"+( i + 1 + " Умножить "));
            for(int j = 0; j < arr8[i].length; j++){
                if(j == 0)
                    System.out.print(arr8[i][j]+" на ");
                if(j == 1)
                    System.out.println(arr8[i][j]);
            }
        }



        System.out.println("\n9th task");

        String str1 = "";
        Scanner var_per = new Scanner(System.in);
        while (str1.isEmpty()){
            System.out.println("Введите строку");
            str1 = var_per.nextLine();
        }
        System.out.println("Введите подстроку для замены");
        String str2 = var_per.nextLine();
        System.out.println("Введите новую подстроку для замены");
        String str3 = var_per.nextLine();
        str1 = str1.replace(str2, str3);
        System.out.println(str1);



        System.out.println("\n10th task");
        Scanner scn1 = new Scanner(System.in);
        System.out.println("Введите строку");
        String stroka = scn1.nextLine();
        String result = new StringBuilder(stroka).reverse().toString();
        result = result.replaceAll("(.)(?=.*\\1)", "");
        result = result.replaceAll("\\s+","");
        result = new StringBuilder(result).reverse().toString();
        System.out.println(result);


        System.out.println("\n11th task");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String str11 = scan.nextLine();
        String strEnd = str11.replaceAll("\\D", "");
        int arrInt [] = new int[strEnd.length()];
        for (int i =0; i < strEnd.length(); i++ ){
            arrInt[i] = Integer.parseInt(String.valueOf(strEnd.charAt(i)));
        }
        System.out.println(Arrays.toString(arrInt));


























































    }
}
