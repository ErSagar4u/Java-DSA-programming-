import java.util.Arrays;
public class SelectionSort {
    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 5, 2, 3, 1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
// Output is [1, 2, 3, 5, 6]
