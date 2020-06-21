package GabrielaK;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.util.Objects;
import java.util.Scanner;

public class Dostringu  {
    int dzien;
    int miesiac;
    int rok;

    public int getDzien() {
        return dzien;
    }

    public void setDzien(int dzien) {
        this.dzien = dzien;
    }

    public int getMiesiac() {
        return miesiac;
    }

    public void setMiesiac(int miesiac) {
        this.miesiac = miesiac;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }



    public static String[] miesiact = { "","styczen", "luty", "marzec", "kwiecień", "maj", "czerwiec", "lipiec", "sierpień",
            "wrzesień", "pażdziernik", "listopad", "grudzien"};
    public static String[]  dzien_tyg = { "poniedzialek", "wtorek", "sroda", "czwartek", "piatek", "sobota",
            "niedziela"};




    public static int liczbaDni[] =
            {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

    public static boolean przestepny(int rok) {
        return ((rok % 4 == 0  &&  rok % 100 != 0) || rok % 400 == 0);
    }


    public static int dzienTygodnia(int dzien, int miesiac, int rok) {
        int yy, c, g;
        int wynik;


        int dzienRoku = dzien + liczbaDni[miesiac - 1];
        if ((miesiac > 2) && (przestepny(rok) ==true))
            dzienRoku++;

        yy = (rok - 1) % 100;
        c = (rok - 1) - yy;
        g = yy + (yy / 4);
        wynik = (((((c / 100) % 4) * 5) + g) % 7);
        wynik += dzienRoku - 1;
        wynik %= 7;

        return wynik;
    }


    public static String[] getDzien_tyg() {
        return dzien_tyg;
    }


    public String toString(int dzien, int miesiac, int rok) {

        return "   {" +
                "dzien = " + dzien_tyg[dzienTygodnia(dzien, miesiac, rok)] +" "+
                +dzien+
                ", miesiac = " + miesiact[miesiac] +
                ", rok = " + rok +
                '}';
    }
}



