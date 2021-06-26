
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = { 503, 65, 556, 230, 120 };
        int size = arr.length;
        bubble_sort(arr, size);
    }

    public static void bubble_sort(int arr[], int size) {
        int i, j,temp;
        for (i = 0; i < size - 1; i++) {
            for (j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }

}