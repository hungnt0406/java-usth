package labwork4;

public class Point extends Shape {


    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double calArea(){
        return 0;
    }

    public double calVoume(){
        return 0;
    }
    public String getName(){
        return "this is a point with the coordination"+"["+x+","+y+"]";
    }
}
