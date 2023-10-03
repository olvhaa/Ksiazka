import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc strony");
        int strony = scanner.nextInt();
         scanner.nextLine();
        System.out.println("Podaj tytul");
        String tytul = scanner.nextLine();

        System.out.println("Podaj ilosc tomow");
        int tomy = scanner.nextInt();


        Ksiazka ksiazka = new Ksiazka("Harry Potter",tomy,strony, "Fantasy");
        System.out.println(ksiazka.iloscStron());
        ksiazka.komunikat();
    }
}