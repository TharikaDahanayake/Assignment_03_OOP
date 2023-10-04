public class Circle extends Shape{

    protected double radius=1.0;

    void Circle(double radius){

    }
    void Circle(double radius, String colour, boolean filled){

    }
    double getRadius(){
        return radius;
    }
    void setRadius(double radius){
        this.radius=radius;
    }
    @Override
    double getArea() {
        double area=Math.PI*(radius*radius);
        return area;
    }
    @Override
    double getPerimeter() {
        double perimeter=2*Math.PI*(radius*radius);
        return perimeter;
    }
    public String toString(){
        return "colour="+ colour+", "+ "filled="+filled +", "+ "radius="+radius;
    }

}

