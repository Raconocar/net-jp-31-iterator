import java.util.*;
import java.util.Iterator;
import java.util.function.Consumer;

public class Randoms implements Iterable<Integer> {
    protected Random random;


    private List<Integer> randomes;

    public Randoms(int min, int max) {
        this.randomes= new ArrayList<>();
        this.randomes.add((random.nextInt(max - min)) + min);
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
                int actual = randomes.get(next);
                return actual;
            }
        };
    }

}