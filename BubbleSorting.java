public class BubbleSorting {
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { // Outer loop for each pass
            for (int j = 0; j < arr.length - 1 - i; j++) { // Inner loop to compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3, 6, 4, 9, 2};
        bubbleSort(arr);
        printArr(arr);
    }   
}
// Output is 2 3 4 6 9 