public class Ksiazka extends Publikacja {

    private int Liczba_stron;
    public static int licznik_obiektow;

    public Ksiazka(String tytul, double cena, int liczba_stron) {
        super(tytul, cena);
        Liczba_stron = liczba_stron;
        licznik_obiektow++;
    }

    public int getLiczba_stron() {
        return Liczba_stron;
    }

    public void setLiczba_stron(int liczba_stron) {
        Liczba_stron = liczba_stron;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul" + getTytul() +
                "cena" + getCena() +
                "Liczba_stron=" + Liczba_stron +
                '}';
    }

}
