package heap_sort.utils;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for (int i =0; i<arr.length-1; i++){
            boolean noChange = true;
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    arr[j]+=arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]-=arr[j+1];
                    noChange = false;
                }
            }
            if (noChange) {
                break;
            }
        }
    }
}
