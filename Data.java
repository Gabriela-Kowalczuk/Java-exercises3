package GabrielaK;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Data<year, day, month> {
    public final int day;
    public final int month;
    public final int year;


    public Data() {
        GregorianCalendar gk = new GregorianCalendar();
        this.day = gk.get(Calendar.DAY_OF_MONTH);
        this.month = gk.get(Calendar.MONTH) + 1;
        this.year = gk.get(Calendar.YEAR);
        System.out.println("Dzień: " + day);
        System.out.println("Miesiąc: " + month);
        System.out.println("Rok: " + year);
    }

    public Data(int dzien, int miesiac, int rok) {
        this.day = dzien;
        this.month = miesiac;
        this.year = rok;

    }
}


