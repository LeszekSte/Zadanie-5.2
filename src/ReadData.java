import java.util.Locale;
import java.util.Scanner;

public class ReadData {
    Scanner sc = new Scanner(System.in);

    Odcinek daneOdcinka(int nrOdcinka) {
        sc.useLocale(Locale.GERMANY);
        System.out.println("Podaj współrzędne początku " + nrOdcinka + " punktu");

        System.out.printf("Początek odcinka nr %d - współrzędna X\n",nrOdcinka);
        int poczatekX = sc.nextInt();
        sc.nextLine();

        System.out.println("współrzędna Y");
        int poczatekY = sc.nextInt();
        sc.nextLine();

        System.out.printf("Koniec odcinka nr %d - współrzędna X\n",nrOdcinka);
        int koniecX = sc.nextInt();
        sc.nextLine();

        System.out.println("współrzędna Y");
        int koniecY = sc.nextInt();
        sc.nextLine();

        Point pointPoczatek = new Point(poczatekX, poczatekY);
        Point pointKoniec = new Point(koniecX, koniecY);

        return new Odcinek(pointPoczatek, pointKoniec);
    }
}
