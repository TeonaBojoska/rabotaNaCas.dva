package Zadaca6;
class Proizvod{
    public String proizvod;
    public int tezina;
    public int cena;
    public Proizvod(){
        proizvod="Chokolado";
        tezina=100;
        cena=55;
    }
}
public class glavna {
    public static void main(String[] args){
        Proizvod p=new Proizvod();
        System.out.println("Cenata na "+p.proizvod+"to so tezina od "+p.tezina+"g"+" iznesuva "+p.cena+" denari.");
    }
}
