package labwork2;

public class NameCardTestDrive {
    public static void main(String[] args){
        NameCard player1 = new NameCard();
        player1.setAttribute("ngoc hung",1232313897, "hung@gmail.com");
        System.out.println(player1.getAttribute());
    }
}
