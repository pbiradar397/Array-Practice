public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {10, 5, 88, 90, 60, 54, 75};
//   BubbleSort b=new BubbleSort();
       bubbleSort(array);

        printArray(array);

//        int length = array.length;


    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] bubbleSort(int[] a) {

        int length = a.length;

        for (int i=0;i< length;i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                System.out.println(a[j]);
            }
        }


        return a;
    }

}
