public abstract class Publikacja {
    private String Tytul;
    private double cena;

    public Publikacja(String tytul, double cena) {
        Tytul = tytul;
        this.cena = cena;
    }

    public String getTytul() {
        return Tytul;
    }

    public void setTytul(String tytul) {
        Tytul = tytul;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Publikacja{" +
                "Tytul='" + Tytul + '\'' +
                ", cena=" + cena +
                '}';
    }
}
