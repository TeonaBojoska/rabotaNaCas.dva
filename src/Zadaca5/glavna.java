package Zadaca5;
import java.security.Permission;
class Predmet{
    public String predmet;
    public String profesor;
    public int brojNaKrediti;
    public int semestar;
    public Predmet(){
        predmet=" ";
        profesor=" ";
        brojNaKrediti=0;
        semestar=0;
    }
    public Predmet(String predmet){
        this.predmet=predmet;
    }
    public Predmet(String predmet,String profesor,int brojNaKrediti){
        this.predmet=predmet;
        this.profesor=profesor;
        this.brojNaKrediti=brojNaKrediti;
    }
}
public class glavna {
    public static void main(String[] args){
        Predmet p1=new Predmet();
        p1.predmet="Informatika";
        p1.profesor="Simona";
        p1.brojNaKrediti=6;
        p1.semestar=2;
        System.out.println("Difolten konstruktor so podatoci za klasata Predmet dodeleni vo glavnata klasa:");
        System.out.println("Predmet:"+p1.predmet+" Profesor:"+p1.profesor+" Krediti:"+p1.brojNaKrediti+" Semestar:"+p1.semestar);

        Predmet p2=new Predmet("Matematika1","Marko",5);
        System.out.println("Dinamicen konstruktor so podatoci za klasata Predmet dodeleni vo glavnata klasa:");
        System.out.println("Predmet:"+p2.predmet+" Profesor:"+p2.profesor+" Krediti:"+p2.brojNaKrediti+" Semestar:"+"2");

        Predmet p3=new Predmet("Informatika2","Monika",5);
        System.out.println("Dinamicen konstruktor so podatoci za klasata Predmet dodeleni vo glavnata klasa:");
        System.out.println("Predmet:"+p3.predmet+" Profesor:"+p3.profesor+" Krediti:"+p3.brojNaKrediti+" Semestar:"+"4");
    }
}
