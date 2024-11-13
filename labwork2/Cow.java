package labwork2;

public class Cow {
    private String name;
    private String breed;
    private int age;


    public void moo(){
        System.out.println("moooo.....");
    }

    public void setAttribute(String nameinput, String breedinput,int ageinput){
        this.name = nameinput;
        this.breed = breedinput;
        this.age = ageinput;
     }
     public String getAttribute(){
        return name + "\n" + breed + "\n" +age;
     }

}
