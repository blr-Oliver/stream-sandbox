package by.ctdev.sandbox.stream.problems;

import java.util.function.Function;
import java.util.stream.Stream;

import by.ctdev.sandbox.stream.Bank;

public interface Solution<R> extends Function<Stream<Bank>, R> {
  public static final Object NO_RESULT = new Object() {
    public String toString() {
      return "<no result>";
    }
  };

  @Override
  R apply(Stream<Bank> t);
}
