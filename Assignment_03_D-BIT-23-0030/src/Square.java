public class Square extends Rectangle{
    protected double side;

    void Square(double side){

    }
    void Square(double side, String colour, boolean filled){

    }
    double getSide(){
        return side;
    }
    void setSide(double side){
        this.side=side;
    }
    void setWidth(double side){
        this.width=side;
    }
    void setLength(double side){
        this.length=side;
    }
    public String toString(){
        return "colour="+ colour+", "+ "filled="+filled +", "+ "length="+length+ ", "+ "width="+width;
    }
}
