package by.ctdev.sandbox.stream.problems;

import by.ctdev.sandbox.stream.Bank;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountForEachCity implements Solution<Map<String, Long>>{
    @Override
    public Map<String, Long> apply(Stream<Bank> stream) {
        return stream
                .collect(Collectors.groupingBy(Bank::getCity, Collectors.counting()));
    }
}
