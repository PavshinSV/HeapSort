package heap_sort;

import heap_sort.utils.PrepareArray;
import heap_sort.utils.PrintArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        PrepareArray prepare = new PrepareArray();
        PrintArray print = new PrintArray();
        int size = 100000;
        int[] bearingArray = prepare.init(size);
        //print.print(arr);
        int[] arr1 = bearingArray.clone();
        int[] arr2 = bearingArray.clone();

        long start = System.currentTimeMillis();
        Arrays.sort(arr1);
        long end = System.currentTimeMillis();
        System.out.printf("Время на сортировку массива из %d элементов базовым функционалом Java составляет: %d мс\n",size,end-start);
    }
}
