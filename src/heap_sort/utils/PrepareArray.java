package heap_sort.utils;

import java.util.Random;

public class PrepareArray {

    public static int[] prepareArray(int size){
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i<array.length; i++) {
            array[i] = random.nextInt(size);
        }
        return array;
    }
}
