package labwork4;

public class Cylinder extends Circle {
    public Cylinder(double x,double y, double r, double h){
        super(x,y,r);
        this.height =h;
    }

    public double calArea(){
        return  2*3.14*this.radius*(this.height+this.radius);
    }


    public double calVoume(){
        return 3.14*this.radius*this.radius*this.height;

    }
    
    public String getName(){
        return "this is a cylinder with the coordination of center "+"["+this.x+","+this.y+"] , radius = "+this.radius+"and height ="+this.height;
    }

}
