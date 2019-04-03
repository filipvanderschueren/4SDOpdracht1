public class Chrono
{
    public long tijd, begin;
    public boolean running;

    public Chrono()
    {
        running=false;
        tijd = 0;
        begin = 0;
    }
    //inserted by filip

    public long getTijd() {
        return tijd;
    }

    public void start()
    {
        begin = System.nanoTime();
        running = true;
        //System.out.println("begin value inside chrone : " + begin);
    }

    public void stop(String type)
    {
        if (running)
        {
            tijd = System.nanoTime()-begin;
            //System.out.println("stop: tijd-begin inside chrone : " + tijd);
            print(type);
        }
        else
            System.out.println("Kan de chrono niet stoppen aangezien deze niet gestart is.");

        running = false;
    }

    private void print(String type)
    {
        float printtijd;
        //printtijd = tijd;
        //System.out.format("%s = %.1f ns\n", type, printtijd);

        if (tijd>=1000000000)
        {
            printtijd = tijd/10000000;      //2 laatste cijfers verlies je
            printtijd = printtijd/100;
            System.out.format("%s = %.1f s\n", type, printtijd);

        }
        else if (tijd>=1000000)
        {
            printtijd = tijd/10000;
            printtijd = printtijd/100;
            System.out.format("%s = %.1f ms\n", type, printtijd);
        }
        else if (tijd>=1000)
        {
            printtijd = tijd/10;
            printtijd = printtijd/100;
            System.out.format("%s = %.1f us\n", type, printtijd);
        }
        else
        {
            printtijd = tijd;
            System.out.format("%s = %.1f ns\n", type, printtijd);
        }
    }
}
