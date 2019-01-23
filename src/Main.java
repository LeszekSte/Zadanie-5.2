import javax.sound.sampled.Line;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.GERMANY);

        System.out.println("Porównanie długości dwóch odcinków:");
        Calculate calculate = new Calculate();

        int nrOdcinka = 0;

        Point point11;
        calculate.daneOdcinka(++nrOdcinka);
        Odcinek odcinek1 = new Odcinek(calculate.pointPoczatek,calculate.pointKoniec);

        calculate.daneOdcinka(++nrOdcinka);
        Odcinek odcinek2 = new Odcinek(calculate.pointPoczatek,calculate.pointKoniec);








       // Odcinek odcinek2= new Odcinek(calculate.odcinek.punktPoczatek,calculate.odcinek.punktPoczatek);

//        System.out.println("Odcinek nr 1  długość" + calculate.dlugoscLini(odcinek1));
        //calculate.menu(++nrOdcinka);


    }
}
