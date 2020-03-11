package by.ctdev.sandbox.stream.problems;

import by.ctdev.sandbox.stream.Bank;

import java.util.stream.Stream;

public class CountDistinctCities implements Solution<Long>{
    @Override
    public Long apply(Stream<Bank> stream) {
        return stream
                //.map(Bank::getCity)
                .map(bank -> bank.getCity())
                .distinct()
                .count();
    }
}
