package GabrielaK;
import GabrielaK.Data;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    private static Data obj;
    private static Rzutowanie other;

    public static void main(String[] args) {

        System.err.print("dzien: ");
        Scanner dzien = new Scanner(System.in);
        int d = dzien.nextInt();
        System.err.print("miesiąc: ");
        Scanner miesiac = new Scanner(System.in);
        int m = miesiac.nextInt();

        System.err.print("rok: ");
        Scanner rok = new Scanner(System.in);
        int r = rok.nextInt();

        if (r < 1582 && m < 10 && d < 15) {
            throw new IllegalArgumentException("kalendarz został wprowadzony 15go października 1582 roku, " +
                    " wprowadż więc datę większą niż data powstania kalendarza");
        }

        try {
            if ((m > 12)) throw new IllegalArgumentException("wartosc spoza zakresu, " +
                    "max miesiecy w roku jest 12");
            else if ((d > 31)) throw new IllegalArgumentException("wartosc spoza zakresu, " +
                    "miesiąc musi mieć mniej niż 31 dni");
            else if (other != (Rzutowanie) obj) throw new IllegalArgumentException("rzutowanie się nie udało, ");

        } catch (InputMismatchException ex) {
            System.err.println("błędne dane");
            throw new IllegalArgumentException("podaj dane jakie powinny być", ex);

        }


        Poprawnadata c = new Poprawnadata();
        c.test2(d, m, r);

        Dostringu mm = new Dostringu();

        String aa = mm.toString(d, m, r);
        System.out.println("Data przez ciebie podana:" + aa);


        Data dzisiaj = new Data();


        String aaa = mm.toString(dzisiaj.day, dzisiaj.month, dzisiaj.year);
        System.out.println("Data dzisiejsza :   " + aaa);


        Rzutowanie rz1 = new Rzutowanie(dzisiaj.day, dzisiaj.month, dzisiaj.year);
        Rzutowanie rz2 = new Rzutowanie(d, m, r);


        System.out.println(" Sprawdzane daty :   " + rz1.equals(rz2));

        int wynik = Dostringu.dzienTygodnia(d, m, r);
        String nn = Dostringu.dzien_tyg[wynik];

        int wynik1 = Dostringu.dzienTygodnia(dzisiaj.day, dzisiaj.month, dzisiaj.year);
        String nnn = Dostringu.dzien_tyg[wynik1];

        System.out.println(" Sprawdzane dni :   " + nn.equals(nnn));

        Date date = new Date((int) r, (int) m, (int) d);
        Date date2 = new Date((int) dzisiaj.year, (int) dzisiaj.month, (int) dzisiaj.day);


        int wynik4 = date2.compareTo(date);

        if (wynik4 == -1) {
            System.out.println("bieżąca data jest wcześniejsza od zadanej ");

        } else if (wynik4 == 0) {
            System.out.println("obie daty są takie same ");
        } else if (wynik4 == 1) {
            System.out.println("bieżąca data jest późniejsza od zadanej");
        }

        System.out.println("Wczorajsza data to = " + (dzisiaj.year) + " . " +(dzisiaj.month) +" . " + (dzisiaj.day - 1));

        System.out.println("Jutrzejsza data to = " + (dzisiaj.year) + " . " +(dzisiaj.month) +" . " + (dzisiaj.day + 1));

    }}



