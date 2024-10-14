public class SpringSeason {
    public static void main(String[] args){
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        if(d >31){
            return;
        }
        if(m>12){
            return;
        }
        if(m >= 3 && m <= 6){
            if(m == 6 && d>20){
                System.out.println("false");
                return;
            }
            if(m == 3 && d<20){
                System.out.println("false");
                return;
            }
            System.out.println("true");
        }
    }
}