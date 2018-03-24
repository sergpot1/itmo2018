import java.lang.reflect.Array;
import java.util.Arrays;

public class lesson2303 {
public static void main(String[] args) {

    // массивы
    int arr1 [] = new int[4];
    String [] arr2 = new String[3];

    System.out.println(Arrays.toString(arr1)); // alt+enter import class
    System.out.println(Arrays.toString(arr2));

    int arr3 [] = {4, 8, 9, 7, -23, 11, 17};

    // поиск элемента
    int arr3Elem = arr3 [2];

    // arr3.length;


    // заполнение данными в цикле массива
    for(int i=0; i < arr2.length; i++){
        arr2[i] = "elem # " +i;
    }
    System.out.println(Arrays.toString(arr2));
    // перебор по игдексу
    for(int i = 0; i < arr3.length ; i++){
        System.out.println("#" + i + ": " + arr3[i]);
    }
    // перебор по коллекции(по значениям)
    for (int dig : arr3) {
        System.out.println("dig " + dig);
    }
    System.out.println(Arrays.toString(arr3));



    // int arr3 [] = {4, 8, 9, 7, -23, 11, 17};
    // copy array

    int [] newArr3 = arr3.clone();

    // 2 type to cop array

    //System.arraycopy(
            // массив - источник;
            // позиция - начало нового массива;
            // массив назначения;
            // начальная позиция целевого массива
            // количество копируемых элементов
    //);

    int [] newArr4 = new int[3];
    System.arraycopy(arr3, 2, newArr4, 0, 2);
    System.out.println(Arrays.toString(newArr4));

    //Arrays.copyOf(исходный массив, длина нового массива);
    int [] newArr5 = Arrays.copyOf(arr3, 2);

    // Arrays.copyOfRange (arr3, start_index, end);
    int [] newArr6 = Arrays.copyOfRange(arr3, 2, 4);

    // сравнение массивов
    // Arrays.equals(arr1, arr2);

    // заполнить одинаковыми значениями массив
    Arrays.fill(arr1,2);

    // поиск в массиве (двоичный поиск)         метод двоичного поиска
    // Arrays.binarySearch(имя массива, индекс)
    // Arrays.binarySearch(имя массива, стартовая позиция, конечная позиция, key)
    // массив должен быть отсортирован изначально для использования метода
    // Arrays.binarySearch(arr1, )

    // сортировка массива
    Arrays.sort(arr3);

    Arrays.parallelSort(arr3);

    // поиск игдекса по значению в ячейке
    int c = Arrays.binarySearch(arr3, 2);

    // многомерные массивы
    int [] [] arr2D;
    int [][][] arr4D;

    int [][] arr2d = new int [10][];
    for (int i = 0; i < arr2d.length; i++){
        arr2d[i] = new int[i];
        System.out.println(Arrays.toString(arr2d[i]));
        // System.out.println(Arrays.deepToString(arr2d));
    }
















    }
}
