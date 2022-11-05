package Zadaca4;
class Avtomobil{
    public String marka;
    public String model;
    public int pominatiKm;
    public Avtomobil(){
        marka=" ";
        model=" ";
        pominatiKm=0;
    }
    public Avtomobil(String marka,String model,int pominatiKm){
        this.marka=marka;
        this.model=model;
        this.pominatiKm=pominatiKm;
    }
}
public class glavna {
    public static void main(String[] args){
        Avtomobil a1=new Avtomobil();
        a1.marka="Ford";
        a1.model="Mustang";
        a1.pominatiKm=26;
        System.out.println("Podatoci za prviot objekt:");
        System.out.println("Avtomobil so marka:"+" "+a1.marka+" model:"+a1.model+" i pominati kilometri:"+a1.pominatiKm);

        Avtomobil a2=new Avtomobil("Chevrolet","Camaro",17);
        System.out.println("Podatoci za vtoriot objekt:");
        System.out.println("Avtomobil so marka:"+a2.marka+" model:"+a2.model+" i pominati kilometri:"+a2.pominatiKm);
    }
}
