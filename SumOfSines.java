public class SumOfSines {
    public static void main (String[] args){
        double degree =Double.parseDouble(args[0]);
        double radians= Math.toRadians(degree);
        double sum = Math.sin(2* radians) + Math.cos(3 * radians);
        System.out.println(sum);
    }
}