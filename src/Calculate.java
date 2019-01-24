public class Calculate {

    void porownanieOdcinkow(Odcinek odcinek1, Odcinek odcinek2) {
        double odcinekDluosc1 = dlugoscLini(odcinek1);
        double odcinekDluosc2 = dlugoscLini(odcinek2);

        if (odcinekDluosc1 > odcinekDluosc2) {
            wydruk(1, odcinek1, odcinekDluosc1);
        } else if (odcinekDluosc1 < odcinekDluosc2) {
            wydruk(2, odcinek2, odcinekDluosc2);
        } else {
            int nrod = 0;
            System.out.println("Obydwa odcinki są równe");
            wydruk(++nrod, odcinek1, odcinekDluosc1);
            wydruk(++nrod, odcinek2, odcinekDluosc2);
        }
    }

    double dlugoscLini(Odcinek odcinek) {
        double dlX = odcinek.getPunktKoniec().getX() - odcinek.getPunktPoczatek().getX();
        double dlY = odcinek.getPunktKoniec().getY() - odcinek.getPunktPoczatek().getY();
        return Math.sqrt(dlX * dlX + dlY * dlY);
    }

    void wydruk(int nrOd, Odcinek odcinek, double dlugoscOdcinka) {
        System.out.printf("Odcinek %d o długości %.2f.\n", nrOd, dlugoscOdcinka);
        System.out.println(odcinek.toString());
        System.out.println();
    }
}
