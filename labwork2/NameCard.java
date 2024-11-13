package labwork2;

public class NameCard {
    private String name;
    private int phone;
    private String email;

    public NameCard(){

    }

    public void setAttribute(String nameinput, int phoneinput,String emailinput){
        this.name = nameinput;
        this.phone = phoneinput;
        this.email = emailinput;
     }
     public String getAttribute(){
        return name + "\n" + phone + "\n" +email;
     }
}


