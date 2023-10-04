abstract public class Shape {

    protected String colour="red";
    protected Boolean filled=true;

    void Shape(String colour, boolean filled){

    }
    String getColour(){
        return colour;
    }
    void setColour(String colour){
    }

    boolean isFilled(){
        return filled;
    }
    void setFilled(boolean filled){
    }
    abstract double getArea();

    abstract double getPerimeter();

    public String toString(){
        return "colour = "+ colour+" "+ "filled = "+filled;
    }

}
