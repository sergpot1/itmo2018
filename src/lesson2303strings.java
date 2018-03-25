/*
import java.sql.SQLOutput;

public class lesson2303strings {
    public static void main(String[] args){

        String str = "String";
        String str2 = new String("String 2");

        // форматирование вывода чисел

        String st = String.format("shablon so specialnimi simvolami %d%n", 3434);
        System.out.println(st);


        // для создания строковых объектов - длинных и изменяемых

        StringBuilder sb = new StringBuilder(); // требует меньше ресурсов, не безопасен для многопоточной среды

        StringBuffer sf = new StringBuffer(); // больше ресурсов, безопасно работать в многопоточной среде

        sb.append("some new").append("new");

        sb.insert(3, "hello"); // с 3 позиции добавит hello


        String stFromLoop = "";
        for (int i = 0; i < 10; i++){
            stFromLoop += "number: " +i;
        }
        System.out.println(stFromLoop);

        // javap -c file_name // в терминале
        // StringConcatFactory



        StringBuilder sbLoop = new StringBuilder();
        for (int i = 0; i < 10; i++){
            sbLoop.append("number: ").append(i);
        }

        String str1;
        str1.equals(str2);
        str1.equalsIgnoreCase(str2);
        str2.startsWith("qwe"); // начинается листрока этими символами
        str2.endsWith("sad"); // заканчивается ли строка этими символами

        str1.compareTo(); // проверка с регистром
        str1.compareToIgnoreCase(str2);
        // вернется 0 - если аргумент лексически равен строке str1
        // < 0 если str2 больше str1  !!! почитать в инете
        // > 0 если str1 больше str2


        // длина строки
        str.length();






















    }
}
*/
