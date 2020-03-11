package by.ctdev.sandbox.stream.problems;

import by.ctdev.sandbox.stream.Bank;

import java.util.Comparator;
import java.util.stream.Stream;

public class CountForCity implements Solution<Long>{
    private String cityName;

    public CountForCity(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public Long apply(Stream<Bank> stream) {
        return stream
                //.sorted(Comparator.comparing(Bank::getAddress))
                .filter(bank -> bank.getCity().equalsIgnoreCase(cityName))
                .count();
    }
}
