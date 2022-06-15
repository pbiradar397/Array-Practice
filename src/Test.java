public class Test {

    public static void main(String[] args) {
        Reactangle r = new Reactangle();

//        r.setL(5);
//        r.setB(8);
        r.setArea(5,8);
        r.setPerimeter(5,8);


        System.out.println("Area of rectangle: " + r.getArea());
        System.out.println("Perimeter of Rectangle: " + r.getPerimeter());


    }
}


