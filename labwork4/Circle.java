package labwork4;

public class Circle extends Point {

    public Circle(double x, double y, double r){
      super(x,y);
      this.radius=r;
    }
    
    public double calArea(){
        return 2*3.14*this.radius;
    }

    public double calVoume(){
        return 3.14*Math.pow(radius, 2);
    }

    public String getName(){
        return "this is a circle with the coordination"+"["+this.x+","+this.y+"] and radius = "+this.radius;
    }
}
