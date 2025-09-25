public class MergeSort {
    public static void mergeSort(int[] arr, int lo, int hi) {

        if (lo < hi){ // multiple elements to sort
            int mid  = lo + (hi - lo) / 2;

            System.out.println("Sorting elements between: " + lo + " and " + hi);
            mergeSort(arr, lo, mid); // recurse on the left
            mergeSort(arr, mid + 1, hi); // recurse on the right

            merge(arr, lo, mid, hi);
        }

    }

    public static void merge(int[] arr, int lo, int mid, int hi) {
        int[] temp = new int[arr.length];
        for (int i = lo; i <= hi; i++) { // copy elements from input array into temp
            temp[i] = arr[i];
        }
        int i = lo;
        int j = mid + 1;

        System.out.println("Merging elements between: " + lo + " and " + hi);

        for (int k = lo; k <= hi; k++) {
            if (i > mid) { // no elements on the left, pick from the right
                arr[k] = temp[j++]; // increase the right counter
            }
            else if (j > hi) { // no elements on the right, pick from the left
                arr[k] = temp[i++]; // increase left counter
            }
            else if (temp[i] < temp[j]) { // left element is smaller, pick from the left
                arr[k] = temp[i++];
            }
            else { // right element is smaller, pick from the right
                arr[k] = temp[j++];
            }
        }

    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 34, 17, 23, 5, 9, 7 };
        System.out.println("Original Array: ");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: ");
        printArray(arr);

    }
}
