package by.ctdev.sandbox.stream.problems;

import by.ctdev.sandbox.stream.Bank;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDistributionStats implements Solution<Map<Long, Long>> {
    @Override
    public Map<Long, Long> apply(Stream<Bank> stream) {
        Map<String, Long> stats = stream
                .collect(Collectors.groupingBy(Bank::getCity, Collectors.counting()));

        return stats.entrySet().stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue,
                        TreeMap::new,
                        //Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                        Collectors.counting()
                ));

    }
}
