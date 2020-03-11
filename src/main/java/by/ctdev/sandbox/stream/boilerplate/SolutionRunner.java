package by.ctdev.sandbox.stream.boilerplate;

import by.ctdev.sandbox.stream.Bank;
import by.ctdev.sandbox.stream.problems.Solution;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class SolutionRunner implements Consumer<Solution<?>> {

    @Override
    public void accept(Solution<?> solution) {
        BankStreamer streamer = new BankStreamer("/by/ctdev/sandbox/stream/banks.csv");
        Stream<Bank> bankStream = streamer.stream();
        StreamStats stats = new StreamStats();
        bankStream = bankStream.peek(stats);
        PrettyPrinter printer = new PrettyPrinter();

        printer.prettyPrint(solution.apply(bankStream));

        printer.prettyPrint("-------------STATS-------------");
        printer.prettyPrint("processed:      " + stats.getCount());
        printer.prettyPrint("duration:       " + stats.getDuration() / 1000000 + "ms");
        printer.prettyPrint(String.format("op / sec:       %.2f\n", stats.getPerformance() * 1000000000));
    }
}
