package forall.utils;

import java.util.Iterator;
import java.util.stream.Stream;

/**
 * Created by oljashabanova on 18/03/16.
 */
public class StreamUtils {

    public static <T> Stream<T> asStream(final Iterator<T> sourceIterator) {

        return asStream(sourceIterator, false);
    }


}

