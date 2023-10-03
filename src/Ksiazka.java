public class Ksiazka {

    String tytul;
    int tomy;
    int strony;
    String kategoria;

    public Ksiazka(String tytul, int tomy, int strony, String kategoria) {
        this.tytul = tytul;
        this.tomy = tomy;
        this.strony = strony;
        this.kategoria = kategoria;
    }

    public int iloscStron() {
        return (strony * tomy);
    }

    public void komunikat(){
        System.out.println(tytul + " " + kategoria);

    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", tomy=" + tomy +
                ", strony=" + strony +
                ", kategoria='" + kategoria + '\'' +
                '}';
    }


    // int metoda zwracajaca ile stron bedzie miala ksiazka 4*iles stron
    //void wyswietla komunikat zobaczymy ze tytul ksiazki bedzie podany jest w kategorii i kategoria podac

}
