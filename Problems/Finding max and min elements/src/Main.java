import java.util.*;
import java.util.function.*;
import java.util.stream.*;


class MinMax {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {


        List<T> values = new ArrayList<>();
        values.add(null);
        values.add(null);
        Consumer<? super T>findMax =  new Consumer<>() {
            boolean found = false;
            @Override
            public void accept(T t) {
                if (!found) {
                    values.set(0, t);
                    values.set(1, t);
                    found = true;
                } else {
                    if (order.compare(t, values.get(0)) > 0) {
                        values.set(0, t);
                    }
                    if (order.compare(t, values.get(1)) < 0) {
                        values.set(1, t);
                    }
                }
            }

        };
        stream.forEach(findMax);
        minMaxConsumer.accept(values.get(1), values.get(0));
        // your implementation here
    }
}