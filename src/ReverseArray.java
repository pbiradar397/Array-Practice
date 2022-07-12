public class ReverseArray {
//    static void reverse(int[] a, int n) {
//        System.out.println("Given array is: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(a[i] + " ");
//        }
//        int i, k, temp;
//        for (i = 0; i < n / 2; i++) {
//            temp = a[i];
//            a[i] = a[n - i - 1];
//            a[n - i - 1] = temp;
//        }
//
//        System.out.println();
//
//        System.out.println("reversed array is:");
//        for (k = 0; k < n; k++) {
//            System.out.print(a[k] + " ");
//        }
//
//    }
//    approach 2
static void reverse(int a[], int n)
{
    int[] b = new int[n];
    int j = n;
    for (int i = 0; i < n; i++) {
        b[j - 1] = a[i];
        j = j - 1;
    }

    // printing the reversed array
    System.out.println("Reversed array is: \n");
    for (int k = 0; k < n; k++) {
        System.out.println(b[k]);
    }
}

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        reverse(a, a.length);
    }
}
