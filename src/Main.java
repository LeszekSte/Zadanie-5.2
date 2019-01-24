public class Main {
    public static void main(String[] args) {
        System.out.println("Porównanie długości dwóch odcinków:");

        int nrOdcinka = 0;
        ReadData readData = new ReadData();
        Odcinek odcinek1 = readData.daneOdcinka(++nrOdcinka);
        Odcinek odcinek2 = readData.daneOdcinka(++nrOdcinka);

        Calculate calculate = new Calculate();
        calculate.porownanieOdcinkow(odcinek1, odcinek2);
        readData.sc.close();
    }
}
