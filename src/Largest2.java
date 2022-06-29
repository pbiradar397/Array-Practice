import java.util.Arrays;

public class Largest2 {

     static  void secondLargest(int arr[],int arr_size)
     {
         if (arr_size<2) {
             System.out.println("invalid input");

         }
         Arrays.sort(arr);

         for (int i=arr_size-2;i>=0;i--) {
             if (arr[i]!= arr[arr_size-1]) {
                 System.out.println("the second largest element in an array is "+arr[i]);
                 return;
             }

         }
         System.out.println("there is no second largest element");

     }

    public static void main(String[] args) {
         int arr[]={25,36,12,8,1,27};
         int n= arr.length;
       secondLargest(arr,n);

    }
}
