
import java.util.Scanner;

import static java.util.Locale.GERMANY;

public class ReadData {
    Scanner sc = new Scanner(System.in);

    Odcinek daneOdcinka(int nrOdcinka) {
        sc.useLocale(GERMANY);
        System.out.println("Podaj współrzędne początku " + nrOdcinka + " odcinka");

        System.out.println("Punkt początkowy - współ. X");
        int poczatekX = sc.nextInt();
        sc.nextLine();

        System.out.println("Punkt początkowy współ. Y");
        int poczatekY = sc.nextInt();
        sc.nextLine();

        System.out.println("Punkt końcowy współ. X");
        int koniecX = sc.nextInt();
        sc.nextLine();

        System.out.println("Punkt końcowy współ. Y");
        int koniecY = sc.nextInt();
        sc.nextLine();

        Point pointPoczatek = new Point(poczatekX, poczatekY);
        Point pointKoniec = new Point(koniecX, koniecY);

        return new Odcinek(pointPoczatek, pointKoniec);
    }
}
