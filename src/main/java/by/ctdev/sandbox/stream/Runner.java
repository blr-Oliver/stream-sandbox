package by.ctdev.sandbox.stream;

import by.ctdev.sandbox.stream.boilerplate.SolutionRunner;
import by.ctdev.sandbox.stream.problems.*;

public class Runner {

    public static void main(String[] args) {
        SolutionRunner runner = new SolutionRunner();
        //runner.accept(new CountForCity("Минск"));
        //runner.accept(new CountDistinctCities());
        //runner.accept(new CountForEachCity());
        //runner.accept(new CollectDistributionStats());
        //runner.accept(new FindCitiesWithDescription());
        //runner.accept(new FindCitiesWithBankCount(3));
        runner.accept(new CheckSamePhonePattern());
    }

}
