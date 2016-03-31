package forall.utils;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
/**
 * Created by oljashabanova on 18/03/16.
 */
public class StreamUtils {

    public static <T> Stream<T> asStream(final Iterator<T> sourceIterator) {

        return asStream(sourceIterator, false);
    }

    public static <T> Stream<T> asStream(final Iterator<T> sourceIterator, final boolean parallel) {
        final Iterable<T> iterable = () -> sourceIterator;
        return StreamSupport.stream(iterable.spliterator(), parallel);
    }
}

