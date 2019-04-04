public class Go {
    public static void main(String args[])
    {
        //https://stackoverflow.com/questions/11452597/precision-vs-accuracy-of-system-nanotime

        int aantal = 100;
        int gem1, gem2;
        RandomArray r;
        int[] X;

        //make X
        r = new RandomArray(aantal);
        r.generate();
        X = r.getRij();
        System.out.println("array X lengte : " + X.length);


        Chrono c1 = new Chrono();    //2de chrono - mag weg
        //added by Filip
        System.out.print("** c1 started: ");
        c1.start();
        prefixAverages1 p1 = new prefixAverages1();
        gem1 = p1.start(aantal, X);    //A1 niet gebruikt, beter in prefix1
        System.out.print("** c1 stopped: ");
        c1.stop("t1_m");

        Chrono c2 = new Chrono();    //2de chrono - mag weg
        //added by Filip
        System.out.print("** c2 started: ");
        prefixAverages2 p2 = new prefixAverages2();
        c2.start();
        gem2 = p2.start(aantal, X);
        System.out.print("** c2 stopped: ");
        c2.stop("t2_m");

        //added by me to test
//        System.out.printf("end : " + c.getTijd());
//        System.out.printf("\n");
//        float t;
//        long cend = c.getTijd();
//        t = cend/1000; System.out.printf("/1000 : " + t); System.out.printf("\n");
//        t = t/1000; System.out.printf("/1000 : " + t); System.out.printf("\n");

    }
}
