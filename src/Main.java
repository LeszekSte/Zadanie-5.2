public class Main {
    public static void main(String[] args) {
        System.out.println("Porównanie długości dwóch odcinków:");

        int nrOdcinka = 0;
        ReadData readData = new ReadData();
        Odcinek odcinek1 = readData.daneOdcinka(++nrOdcinka);
        Odcinek odcinek2 = readData.daneOdcinka(++nrOdcinka);

        Calculate calculate = new Calculate();
//        calculate.porownanieOdcinkow(odcinek1, odcinek2);
        Odcinek ktoryDluzszy = calculate.porownaOdc(odcinek1, odcinek2);

        if (ktoryDluzszy == null) {
            System.out.println("Obydwa odcinki są równe");
            calculate.wydruk(odcinek1, calculate.dlugoscLini(odcinek1));
        } else if (ktoryDluzszy.equals(odcinek1)) {
            System.out.println("odcinek 1 jest dłuższy od odcinka 2");
            calculate.wydruk(ktoryDluzszy, calculate.dlugoscLini(ktoryDluzszy));
        } else {
            System.out.println("odcinek 2 jest dłuższy od odcinka 1");
            calculate.wydruk(ktoryDluzszy, calculate.dlugoscLini(ktoryDluzszy));
        }
        readData.sc.close();
    }


}
