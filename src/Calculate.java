public class Calculate {

//    void porownanieOdcinkow(Odcinek odcinek1, Odcinek odcinek2) {
//        double odcinekDluosc1 = dlugoscLini(odcinek1);
//        double odcinekDluosc2 = dlugoscLini(odcinek2);
//
//        if (odcinekDluosc1 > odcinekDluosc2) {
//            wydruk( odcinek1, odcinekDluosc1);
//        } else if (odcinekDluosc1 < odcinekDluosc2) {
//            wydruk( odcinek2, odcinekDluosc2);
//        } else {
//            int nrod = 0;
//            System.out.println("Obydwa odcinki są równe");
//            wydruk(odcinek1, odcinekDluosc1);
//
//        }
//    }

    Odcinek porownaOdc(Odcinek odcinek1, Odcinek odcinek2) {
        Odcinek odcinek = null;
        double odcinekDluosc1 = dlugoscLini(odcinek1);
        double odcinekDluosc2 = dlugoscLini(odcinek2);

        if (odcinekDluosc1 > odcinekDluosc2) {
            return odcinek1;
        } else if (odcinekDluosc1 < odcinekDluosc2) {
            return odcinek2;
        } else {
            return odcinek;
        }
    }

    double dlugoscLini(Odcinek odcinek) {
        double dlX = odcinek.getPunktKoniec().getX() - odcinek.getPunktPoczatek().getX();
        double dlY = odcinek.getPunktKoniec().getY() - odcinek.getPunktPoczatek().getY();
        return Math.sqrt(dlX * dlX + dlY * dlY);
    }

    void wydruk(Odcinek odcinek, double dlugoscOdcinka) {
        System.out.printf("Długość odcinka %.2f.\n",dlugoscOdcinka);
        System.out.println(odcinek.toString());
        System.out.println();
    }
}
