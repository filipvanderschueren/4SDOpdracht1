import java.util.Random;

public class RandomArray {
    private int[] rij;
    private Random randomGenerator = new Random();
    private int aantal;

    public RandomArray(int aantal)
    {
        this.aantal = aantal;
        rij = new int[aantal];
    }

    public void generate()
    {
        for (int i = 0; i < aantal; i++)
        {
            rij[i] = randomGenerator.nextInt(100) + 1;
        }
    }

    public int[] getRij()
    {
        return rij;
    }
}
