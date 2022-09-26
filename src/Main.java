public class Main {
    public static void main(String[] args) {
        //System.out.println("hello wor");
        System.out.println("Mam książek : " + Ksiazka.licznik_obiektow);
        Ksiazka ksiazka1 = new Ksiazka("Metro", 30, 400);
        System.out.println(ksiazka1);
        System.out.println("Mam książek : " + Ksiazka.licznik_obiektow);
        Ksiazka ksiazka2 = new Ksiazka("Wiedźmin", 60, 650);
        System.out.println("Mam książek : " + Ksiazka.licznik_obiektow);
        Ebook ebook1 = new Ebook("Polly Anna",25,Typy_Ebook.pdf);
        System.out.println(ebook1);
        System.out.println("Mam ebooków:"+Ebook.Licznik_obiektow);
    }
}
