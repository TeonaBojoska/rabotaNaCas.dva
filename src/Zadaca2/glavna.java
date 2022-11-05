package Zadaca2;
class Vraboten{
    public String ime;
    public String prezime;
    public int plata;
    public Vraboten(){
        ime="Aleksandar";
        prezime="Spirovski";
        plata=15000;
    }
}
public class glavna {
    public static void main(String[] args){
        Vraboten v=new Vraboten();
        System.out.println("Imeto na vraboteniot e"+" "+v.ime+".");
        System.out.println("Prezimeto na vraboteniot e"+" "+v.prezime+".");
        System.out.println("Negovata plata iznesuva"+" "+v.plata+"denari"+".");
    }
}
