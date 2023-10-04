public class Rectangle extends Shape{
    protected double width=1.0;
    protected double length=1.0;

    void Rectangle(double width,double length){

    }
    void Rectangle(double width,double length, String colour, boolean filled){

    }
    double getWidth(){
        return width;
    }
    void setWidth(double width){
        this.width=width;
    }
    double getLength(){
        return length;
    }
    void setLength(double length){
        this.length=length;
    }
    @Override
    double getArea() {
        double area=length*width;
        return area;
    }
    @Override
    double getPerimeter() {
        double perimeter=(length*2)+(width*2);
        return perimeter;
    }

    public String toString(){
        return "colour="+ colour+", "+ "filled="+filled +", "+ "length="+length+ ", "+ "width="+width;
    }
}
