import java.util.Locale;
import java.util.Scanner;

public class Calculate {

    public Odcinek odcinek;

    double dlugoscLini ( Odcinek odcinek){
        double dlX =   odcinek.getPunktKoniec().getX() - odcinek.getPunktPoczatek().getX();

        System.out.println("odcinek  K getX " + odcinek.getPunktKoniec().getX());
        System.out.println("odcinek  P getX " +odcinek.getPunktPoczatek().getX());

        double dlY =   odcinek.getPunktKoniec().getY() - odcinek.getPunktPoczatek().getY();
        System.out.println("dlY  --" + dlY);
        return  Math.sqrt( dlX * dlX + dlY * dlY);
    }

    void menu (int nrOdcinka){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.GERMANY);

        System.out.println("Podaj współrzędne początku " +nrOdcinka + " punktu");

        System.out.println("Początek - współrzędna X");
        int poczatekX = sc.nextInt();
        sc.nextLine();

        System.out.println("Początek - współrzędna Y");
        int poczatekY = sc.nextInt();
        sc.nextLine();

        System.out.println("Koniec - współrzędna X");
        int koniecX = sc.nextInt();
        sc.nextLine();

        System.out.println("Koniec - współrzędna Y");
        int koniecY = sc.nextInt();
        sc.nextLine();

        Point pointPoczatek = new Point(poczatekX, poczatekY);
        Point pointKoniec = new Point(koniecX, koniecY);

        odcinek = new Odcinek(pointPoczatek,pointKoniec);
    }
}
