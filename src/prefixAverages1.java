public class prefixAverages1 {
    private RandomArray r;
    private Chrono c = new Chrono();
    int n;
    int a;
    int gem;
    //int[] X,A;  //X volstaat, A weg


    public   prefixAverages1()
    {

    }

    public int start(int n, int[] X)
    {

        c.start();
        System.out.println("starting prefix 1");

        //System.out.println("chrono start inside 1 : " + c.getTijd());

        //n = X.length;   //toegevoegd - stond op 0
        for (int i = 0; i < n; i++)         // 1 + 2n
        {
            a = 0;                          // n

            for (int j = 0; j < i; j++)     // 1 + 2 * (som(j) voor j van 0 tot n) = 1 + (n*(n+1))
            {
                a = a + X[j];                  // 2n(n+1)

            }
            gem = a/(i+1);                 // 3n
            //added by filip
            //System.out.println ("value X : " + X[i]);
            //System.out.println ("value A : " + A[i]);


        }
                                            // Totaal: 1 + 2n + n + 1 + n² + n + 2n² + 2n + 3n = 3n² + 9n + 2

        //System.out.println("chrono stop inside 1 : " + c.getTijd());
        //added by filip


        c.stop("t1");
        System.out.println ("value gem : " + gem);
        return gem;   //no return
    }
}