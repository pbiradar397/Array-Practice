package oops;


public class PlayingWithThis {
    String name;
    int age;
    char a;

    public void printInfo() {
        System.out.println("no arg method");
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void printInfo(int a, String n) {
        this.age = age;
        this.name = name;

    }

        public static void main(String[] args) {
            PlayingWithThis v = new PlayingWithThis();
            v.name = "vinod Kumar";
            PlayingWithThis v1 = new PlayingWithThis();

            System.out.println(v.name);
            v.printInfo(23, "vishal kumar");
            System.out.println(v.name);
        }
    }



