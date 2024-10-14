public class SumOfTwoDice {
    public static void main(String[] args) {
        int SIDES = 6; //a dice has 6 sides
        int a = 1 + (int) (Math.random() * SIDES); //math.ramdom() generate a random value [0.6) dont include 6 => we need to add 1 to have result's range from 1 to 6
        int b = 1 + (int) (Math.random() * SIDES);
        System.out.println("1st roll is "+a+"2nd roll is "+b);
        int sum = a + b;
        System.out.println(sum);
    }
}