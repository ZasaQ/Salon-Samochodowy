import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Samochody {
    String id_samochodu;
    String marka;
    String model;
    String kolor;
    String rocznik;
    String cena;

    public Samochody(){
      this.id_samochodu="";
      this.marka="";
      this.model="";
      this.kolor="";
      this.rocznik="";
      this.cena="";
    }

     public Samochody(String id_samochodu,String marka,String model,String kolor,String rocznik,String cena) {
        this.id_samochodu=id_samochodu;
        this.marka=marka;
        this.model=model;
        this.kolor=kolor;
        this.rocznik=rocznik;
        this.cena=cena;
    }


     public void wypiszWszystko() throws IOException {
        String[] car = new String[ileLinii()];
        String x;
        for(int i=0;i<car.length;i++) {
            x = getLine(i);
            car=x.split(" ");
            System.out.println(car[i]);
        }
    }

    public void wypisz(String[] x){
        String[] y = new String[]{"ID","Marka","model","kolor","rocznik","cena"};
        for(int i=0;i<y.length;i++){
            System.out.println(y[i]);
        }
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }

    public String getLine(int line) throws IOException{
        return Files.lines(Paths.get("src/baza.txt")).skip(line-1).findFirst().get();
    }

    public String[] wypelnij(int choice) throws IOException {
        String x = getLine(choice);
        String[] y= x.split(" ");
        return y;
    }

    public int ileLinii() throws FileNotFoundException {
        File plik = new File("src/baza.txt");
        Scanner o = new Scanner(plik);
        int linia = 0;
        while(o.hasNextLine()&&!o.equals(null)){
            linia++;
        }
        return linia;
    }

    public static void main(String[] args) throws IOException {
        Samochody s = new Samochody();
        int choice=0;
        String[] info=s.wypelnij(choice);
        s.wypisz(info);
        s.wypiszWszystko();
        Scanner wprowadz = new Scanner(System.in);
        System.out.println("wybierz numer");
        int n=wprowadz.nextInt();
        String[] pojazd = new String[]{};
        switch (n){
            case 1:
                s.wypiszWszystko();
            break;
            case 2:
                System.out.println("Wybierz samochod po id");
                int m=wprowadz.nextInt();
                pojazd=s.wypelnij(m);
                s.wypisz(pojazd);
        }
    }

}
