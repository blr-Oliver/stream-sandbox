package by.ctdev.sandbox.stream.problems;

import by.ctdev.sandbox.stream.Bank;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckSamePhonePattern implements Solution<List<String>> {

    private static final Pattern PATTERN = Pattern.compile("\\+375 \\d{2} \\d{3}-\\d{2}-\\d{2}");

    @Override
    public List<String> apply(Stream<Bank> stream) {
        Predicate<String> predicate = PATTERN.asPredicate();
        Map<Boolean, List<String>> classified = stream
                .map(Bank::getPhone)
                .filter(Objects::nonNull)
                .collect(Collectors.partitioningBy(predicate, Collectors.toList()));
        return classified.get(false);
    }
}
