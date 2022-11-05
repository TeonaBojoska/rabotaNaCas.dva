package Zadaca1;
class Student{
    public String ime;
    public String prezime;
    public int indeks;
    public Student(){

    }
    public Student(String ime,String prezime,int indeks){
        this.ime=ime;
        this.prezime=prezime;
        this.indeks=indeks;
    }
}
public class glavna {
    public static void main(String[] args){
        Student s1=new Student();
        s1.ime="Teona";
        s1.prezime="Bojoska";
        s1.indeks=896;
        System.out.println("Vneseni podatoci za prviot objekt:");
        System.out.println("Ime:"+s1.ime+" Prezime:"+s1.prezime+" Indeks:"+s1.indeks);

        Student s2=new Student("Petar","Petrovski",787);
        System.out.println("Vneseni podatoci za vtoriot objekt:");
        System.out.println("Ime:"+s2.ime+" Prezime:"+s2.prezime+" Indeks:"+s2.indeks);
    }
}
