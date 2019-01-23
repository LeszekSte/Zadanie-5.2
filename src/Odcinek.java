public class Odcinek {

    private Point punktPoczatek;
    private Point punktKoniec;

    public Point getPunktPoczatek() {
        return punktPoczatek;
    }

    public void setPunktPoczatek(Point punktPoczatek) {
        this.punktPoczatek = punktPoczatek;
    }

    public Point getPunktKoniec() {
        return punktKoniec;
    }

    public void setPunktKoniec(Point punktKoniec) {
        this.punktKoniec = punktKoniec;
    }

    public Odcinek(Point punktPoczatek, Point punktKoniec) {
        this.punktPoczatek = punktPoczatek;
        this.punktKoniec = punktKoniec;
    }

    @Override
    public String toString() {
        return "Odcinek{" +
                "punktPoczatek=" + punktPoczatek +
                ", punktKoniec=" + punktKoniec +
                '}';
    }
}
