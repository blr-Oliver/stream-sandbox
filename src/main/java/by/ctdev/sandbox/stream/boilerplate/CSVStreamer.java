package by.ctdev.sandbox.stream.boilerplate;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CSVStreamer {

    private final Charset encoding;

    public CSVStreamer() {
        this.encoding = Charset.forName("UTF-8");
    }

    public CSVStreamer(String charset) {
        this.encoding = Charset.forName(charset);
    }

    public CSVStreamer(Charset encoding) {
        this.encoding = encoding;
    }

    public <T> Stream<T> stream(InputStream source, Function<String[], T> rowAggregator) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(source, encoding));
        final String[] dummy = new String[0];
        return reader
                .lines()
                .filter(line -> !line.isEmpty())
                .map(line -> line.substring(1, line.length() - 1))
                .map(line -> Stream
                        .of(line.split("\\\",\\\""))
                        .map(s -> s.replace('\'', '"'))
                        .map(s -> s.isEmpty() ? null : s)
                        .collect(Collectors.toList())
                        .toArray(dummy)
                )
                .map(rowAggregator::apply);
    }

}
