import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    MyRandomeImpl myRand;

    public Randoms(int min, int max) {
        this.myRand = new MyRandomeImpl(min, max);
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
