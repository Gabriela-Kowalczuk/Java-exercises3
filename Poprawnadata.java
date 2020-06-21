package GabrielaK;




    public class Poprawnadata extends Przestepny    {

        public Poprawnadata(int dzien, int miesiac, int rok) {
        }

        public static void test2(int n,int  m, int r){
            boolean bool;

            int x = iledni(m, r);
            if (n <= x) {
                bool = true;
                System.out.println("data poprawna");
            } else if (n > x) {
                bool = false;
                System.out.println("data nie poprawna");
            }
        }
        public Poprawnadata() {
            super();
        }
    }


