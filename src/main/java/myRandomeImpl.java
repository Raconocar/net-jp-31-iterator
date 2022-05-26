import java.util.Random;

public class myRandomeImpl {
    protected static Random random;
    protected static int min;
    protected static int max;

    public myRandomeImpl(int min, int max) {
        this.max = max;
        this.min = min;
        this.random = new Random();
    }

    public static int getRand() {
         int ranInt = random.nextInt(max - min) + min+1;
        return ranInt;
    }
}
