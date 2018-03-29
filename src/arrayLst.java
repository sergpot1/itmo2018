import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class arrayLst {
    public static void main(String[] args){


        //Расширяемый массив

        ArrayList<String> list = new ArrayList<>(); // size in - (50)
        System.out.println(list);


        list.add("First elem");
        list.add(1,"Second elem");
        list.add("hello");
        String str1 = list.get(1); // получить индекс
        list.indexOf("Second elem"); // узнать индекс
        System.out.println("str1");
        System.out.println(list);
        list.set(1,"hello"); // заменить значение элемента 1 на "hello"
        list.size(); // длина элементов
        System.out.println(list.size());

        boolean a = list.contains("hello"); // содержит ли hello
        System.out.println(a);

        String [] newArr = list.toArray(new String[list.size()]);
        list.remove(2); // удаление поиндексу
        list.remove("hello"); // удаление по значению
        System.out.println(list);

        // удаление числа из интового лист массива
        // list.remove((Integer)1) // удаление по значению



        //-------------------------------------------------
        List<String> list2 = new LinkedList<>();
        list2.add("str1");
        list2.add("str2");
        list2.add("str3");
        list2.add("str4");
        System.out.println(list2);



















































    }
}
