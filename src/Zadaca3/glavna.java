package Zadaca3;
class Covek{
    public String ime;
    public String prezime;
    public String maticenBroj;
    public Covek(){
        ime=" ";
        prezime=" ";
        maticenBroj=" ";
    }
}
public class glavna {
    public static void main(String[] args){
        Covek c=new Covek();
        c.ime="Andrea";
        c.prezime="Petrovska";
        c.maticenBroj="0512002453";
        System.out.println("Imeto na covekot e:"+" "+c.ime);
        System.out.println("Prezimeto na covekot e:"+" "+c.prezime);
        System.out.println("Covekot ima maticen broj:"+" "+c.maticenBroj);
    }
}
