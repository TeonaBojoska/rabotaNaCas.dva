package Zadaca7;
import java.util.Scanner;
class Triagolnik{
    public int a;
    public int b;
    public int c;
    public Triagolnik(){
        a=0;
        b=0;
        c=0;
    }
    public void vnesi(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Vneesi strana a:");
        a=sc.nextInt();
        System.out.println("Vnesi strana b:");
        b=sc.nextInt();
        System.out.println("Vnesi strana c:");
        c=sc.nextInt();
    }
    public void Ploshtina(){
        int P;
        P=2*a*b;
        System.out.println("Ploshtinata na triagolnikot iznesuva:"+" "+P);
    }
    public void Perimetar(){
        int L;
        L=a*b*c;
        System.out.println("Perimetarot na triagolnikot iznesuva:"+" "+L);
    }
}
public class glavna {
    public static void main(String[] args){
        Triagolnik t=new Triagolnik();
        t.vnesi();
        t.Ploshtina();
        t.Perimetar();
    }
}
