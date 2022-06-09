public class ArrayConcat {
    public static void main(String[] args) {
        int[] a = {4, 5, 6};

        int n = a.length;


        int[] c = new int[2 * n];
        concatArray(a, n, c);
    }

    private static void concatArray(int[] a, int n, int[] c) {
        for (int i = 0; i < 2 * n; i++) {

            c[i] = a[i % n];
            System.out.print(c[i] + " ");


        }
    }
}
