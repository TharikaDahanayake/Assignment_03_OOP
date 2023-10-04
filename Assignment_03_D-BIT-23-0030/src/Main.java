public class Main {
    public static void main(String[] args) {
        Circle obj1=new Circle();
        System.out.println(obj1.toString());
        System.out.println("Area of the Circle : "+obj1.getArea());
        System.out.println("Perimeter of the Circle : "+obj1.getPerimeter());
        System.out.println(" ");

        Rectangle obj2=new Rectangle();
        System.out.println(obj2.toString());
        System.out.println("Area of the Rectangle : "+obj2.getArea());
        System.out.println("Perimeter of the Rectangle : "+obj2.getPerimeter());
        System.out.println(" ");

        Square obj3=new Square();
        System.out.println("Attributes of the Square :");
        System.out.println(obj3.toString());


    }
}
