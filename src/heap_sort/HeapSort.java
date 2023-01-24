package heap_sort;

import heap_sort.utils.BubbleSort;
import heap_sort.utils.HeapMethods;
import heap_sort.utils.PrepareArray;
import heap_sort.utils.PrintArray;

import java.util.Arrays;

import static heap_sort.utils.PrepareArray.prepareArray;
import static heap_sort.utils.PrintArray.print;

public class HeapSort {
    public static void main(String[] args) {
        int size = 20000;
        int[] bearingArray = prepareArray(size);
        //print.print(arr);
        int[] arr1 = bearingArray.clone();
        int[] arr2 = bearingArray.clone();

        long start = System.currentTimeMillis();
        Arrays.sort(arr1);
        long end = System.currentTimeMillis();
        System.out.printf("Время на сортировку массива из %d элементов базовым функционалом Java составляет: %d мс\n",size,end-start);

        //print(arr2);
        start = System.currentTimeMillis();
        HeapMethods.heapSortInc(arr2);
        end = System.currentTimeMillis();
        System.out.printf("Время на сортировку массива из %d элементов написанным методом 'Бинарная куча' составляет: %d мс\n",size,end-start);
        //print(arr2);

        //print(bearingArray);
        start = System.currentTimeMillis();
        BubbleSort.bubbleSort(bearingArray);
        end = System.currentTimeMillis();
        System.out.printf("Время на сортировку массива из %d элементов написанным методом 'Пузырёк' составляет: %d мс\n",size,end-start);
        //print(bearingArray);
    }
}
