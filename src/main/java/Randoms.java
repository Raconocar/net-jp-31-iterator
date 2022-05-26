import java.util.*;
import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    myRandomeImpl myRand;
    private List<Integer> randomes;

    public Randoms(int min, int max) {
        this.randomes = new ArrayList<>();
        this.myRand = new myRandomeImpl(min, max);
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {
            int next = 0;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                next++;
                int actual = myRand.getRand();
                return actual;
            }
        };
    }
}