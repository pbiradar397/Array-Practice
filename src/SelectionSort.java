public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {65, 25, 41, 12, 33, 58};
        int length = arr.length;

        System.out.print("Given Array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
//output {12,25,33,41,58,65}
//        int min_ind= 0;

        for (int i = 0; i < length - 1; i++) {
//            assigning first index as smallest
            int min_indx = i;

//            inner fo looop to traverse through array
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min_indx]) {
//                    re-assigning min_ index
                    min_indx = j;
                }


            }
//            exchanging small values from  min_index
            swap(arr, min_indx, i);


        }
//        printing  sorted array
        printArray(arr, length);

    }

    private static void swap(int[] arr, int min_indx, int i) {
        int temp = arr[min_indx];
        arr[min_indx] = arr[i];
        arr[i] = temp;
    }

    private static void printArray(int[] arr, int length) {
        System.out.print("Sorted Array: ");
        for (int i = 0; i < length; i++) {

            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }


}

