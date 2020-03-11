package by.ctdev.sandbox.stream.problems;

import by.ctdev.sandbox.stream.Bank;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindCitiesWithBankCount implements Solution<Map<String, List<Bank>>>{
    private int count;

    public FindCitiesWithBankCount(int count) {
        this.count = count;
    }

    @Override
    public Map<String, List<Bank>> apply(Stream<Bank> stream) {
        Map<String, List<Bank>> grouping = stream.collect(
                Collectors.groupingBy(Bank::getCity, Collectors.toList()));

        return grouping.entrySet().stream()
                .filter(entry -> entry.getValue().size() >= count)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
