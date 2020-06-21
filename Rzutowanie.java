package GabrielaK;

import java.util.InputMismatchException;

public class Rzutowanie extends Data {

    public Rzutowanie() {
    }

    public Rzutowanie(int dzien, int miesiac, int rok) {
        super(dzien, miesiac, rok);
    }

    String dzien1 = String.valueOf(day);
    String miesiac1 = String.valueOf(month);
    String rok1 = String.valueOf(year);


    public boolean equals(Data obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Rzutowanie other = (Rzutowanie) obj;

        if (dzien1 == null) {
            if (other.dzien1 != null)
                return false;
        } else if (!dzien1.equals(other.dzien1))
            return false;
        else if (!miesiac1.equals(other.miesiac1))
            return false;
        else if (!rok1.equals(other.rok1))
            return false;
        return true;
    }

}
