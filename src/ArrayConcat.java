public class ArrayConcat {
    public static void main(String[] args) {
        int[] a = {4, 5, 6};
        int[] b = {7, 8, 9, 10};


//        int n = a.length;


        int[] c = new int[a.length + b.length];
        concatArray(a,b,c);
    }

    private static void concatArray(int[] a, int[] b, int[] c) {
        for (int i = 0; i < a.length; i++) {
           c[i] = a[i];
//           i=0 c=4,i=1 c[1]=5
        }
        for (int j=a.length,i=0;j<c.length;j++,i++) {
            c[j]=b[i];

        }
        for (int i = 0; i < c.length ; i++) {
            System.out.print(c[i] + " ");

        }




    }
}
