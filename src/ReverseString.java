public class ReverseString {
   static void reverse(String s) {

        char[] ch=s.toCharArray();
        for (int i = ch.length-1; i >= 0 ; i--) {

            System.out.print(ch[i]);

        }

    }

    public static void main(String[] args) {
//        ReverseString str=new ReverseString();
        reverse("Priyanka Biradar");
    }
}
