public class Ebook extends Publikacja {
    private Typy_Ebook typ;
    public static int Licznik_obiektow;

    public Ebook(String tytul, double cena, Typy_Ebook typ) {
        super(tytul, cena);
        this.typ = typ;
        Licznik_obiektow++;
    }

    public Typy_Ebook getTyp() {
        return typ;
    }

    public void setTyp(Typy_Ebook typ) {
        this.typ = typ;
    }

    @Override
    public String toString() {
        return "Ebook{" +
                "tytul" + getTytul() +
                "cena" + getCena() +
                "typ=" + typ +
                '}';
    }
}
