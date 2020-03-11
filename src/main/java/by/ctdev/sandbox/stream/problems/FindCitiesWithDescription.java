package by.ctdev.sandbox.stream.problems;

import by.ctdev.sandbox.stream.Bank;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindCitiesWithDescription implements Solution<Collection<String>> {
    @Override
    public Set<String> apply(Stream<Bank> stream) {
        return stream
                .filter(bank -> bank.getDescription() != null)
                //.map(Bank::getCity)
                .map(bank -> bank.getCity())
                .collect(Collectors.toSet());
    }
}
