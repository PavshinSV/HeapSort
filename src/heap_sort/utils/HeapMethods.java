package heap_sort.utils;

public class HeapMethods {
    public static void heapSortInc(int[] array){
        heapSortInc(array, array.length);
    }

    private static int heapSortInc(int[] array, int numbersToSort){
        if (numbersToSort>1){
            int n = numbersToSort/2 - 1;
            for (int i = n; i>-1;i--){
                int largest=i;
                int first = largest*2+1;
                int second = largest*2+2;
                if (first < numbersToSort - 1 && array[first]>array[largest]) {
                    largest = first;
                }
                if (second < numbersToSort - 1 && array[second]>array[largest]) {
                    largest = second;
                }
                if (i!=largest){
                    array[i] += array[largest];
                    array[largest] =array[i] - array[largest];
                    array[i] -= array[largest];
                }
            }
            numbersToSort--;
            array[0]+=array[numbersToSort];
            array[numbersToSort]=array[0]-array[numbersToSort];
            array[0]-=array[numbersToSort];

            return heapSortInc(array,numbersToSort);
        }
        return 1;
    }
}
