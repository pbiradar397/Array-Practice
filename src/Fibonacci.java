public class Fibonacci {

    public void FibonacciSeries(int n) {
        int a[]=new int[n];
        System.out.println("length of the series to be displayed: "+n);

        a[0]=0;
        a[1]=1;
        System.out.print(a[0]+" "+a[1]+" ");
        for (int i = 2; i < n; i++) {
            a[i]=a[i-1]+a[i-2];
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        Fibonacci fc=new Fibonacci();
        fc.FibonacciSeries(10);
    }

}
