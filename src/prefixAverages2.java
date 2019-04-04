public class prefixAverages2 {
    private RandomArray r;
    private Chrono c = new Chrono();
    int n;
    int a;
    int gem;
    int[] X,A;

    public  prefixAverages2()
    {
//        r = new RandomArray(aantal);
//        r.generate();
//        X = r.getRij();
//        A = new int[aantal];    //was niet geinitialiseerd !!!
        //en bijkomend: dit is een nieuwe rij!!
        //kan je niet beter met dezelfde rij werken???
    }

    public int start(int n, int[] X)
    {
        c.start();
        System.out.println("t2, inside prefix 2");

        //n = X.length;        //toegevoegd - stond op 0
        a = 0;                              // 1

        for (int i = 0; i < n; i++)         // 1 + 2n
        {
            a += X[i];                      // 2n
            gem = a/(i+1);                 // 3n

            //added by filip
            //System.out.println ("value X : " + X[i]);
            //System.out.println ("value A : " + A[i]);
        }
                                            // Totaal: 1 + 1 + 2n + 2n + 3n = 7n + 2
        c.stop("t2");
        System.out.println ("t2: out of P1, value gem : " + gem);
        return gem;
    }
}