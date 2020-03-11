package by.ctdev.sandbox.stream.problems;

import by.ctdev.sandbox.stream.Bank;

import java.util.function.Function;
import java.util.stream.Stream;

public interface Solution<R> extends Function<Stream<Bank>, R> {
    Object NO_RESULT = new Object() {
        public String toString() {
            return "<no result>";
        }
    };

    @Override
    R apply(Stream<Bank> stream);
}
