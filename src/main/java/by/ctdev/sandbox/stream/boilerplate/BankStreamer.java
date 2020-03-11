package by.ctdev.sandbox.stream.boilerplate;

import by.ctdev.sandbox.stream.Bank;

import java.util.stream.Stream;

public class BankStreamer {

    private final String resourcePath;
    private final CSVStreamer streamer;

    public BankStreamer(String resourcePath) {
        this.resourcePath = resourcePath;
        streamer = new CSVStreamer("UTF-8");
    }

    public Stream<Bank> stream() {
        return streamer.stream(getClass().getResourceAsStream(resourcePath), fields -> {
            Bank result = new Bank();

            result.setId(Long.parseLong(fields[0]));
            result.setName(fields[1]);
            result.setDescription(fields[2]);
            result.setPhone(fields[3]);
            result.setCity(fields[4]);
            result.setAddress(fields[5]);
            result.setLon(Double.parseDouble(fields[6]));
            result.setLat(Double.parseDouble(fields[7]));

            return result;
        });

    }

}
