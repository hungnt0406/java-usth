package labwork2;



public class Vector {
    private int x;
    private int y;    

    public void setXY(int x_input, int y_input){
        this.x = x_input;
        this.y = y_input;
    }

    public String getXY(){
        return x + "," + y ;
    }

    public void add(Vector vector2){
        System.out.println((this.x+vector2.x) +","+ (this.y+vector2.y));
    }


    public void subtract(Vector vector2){
        System.out.println((this.x-vector2.x) +","+ (this.y-vector2.y));
    }    
    
    public void dot_product(Vector vector2){
        System.out.println((this.x*vector2.x)+(this.y*vector2.y));
    }

    




}
