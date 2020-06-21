package GabrielaK;

public class Przestepny extends Data {

    boolean bool;

    public Przestepny(int rok) {
    }

    public Przestepny() {
    }

    public static int przestepny(int rok) {

        return rok % 4 == 0 && rok % 100 != 0 || rok % 400 == 0 ? 1 : 0;
    }

    private static int[][] dni = {
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    public static int iledni(int mc, int rok) {
        return dni[przestepny(rok)][mc];
    }




}
