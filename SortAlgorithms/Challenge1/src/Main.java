public class Main {

    // Challenge: Descending Order Merge Sort
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(intArray, 0, intArray.length);
        for (int i = 0; i < intArray.length - 1; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] >= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
        }

        // copy remaining elements from the left array NOTE: If there are leftovers in the right array, their position will not change
        System.arraycopy(input, i, input, start + tempIndex, mid - i);

        // copy values from the temp array to the initial array
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}

