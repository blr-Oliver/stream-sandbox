package by.ctdev.sandbox.stream;

import by.ctdev.sandbox.stream.boilerplate.SolutionRunner;

public class Runner {

    public static void main(String[] args) {
        SolutionRunner runner = new SolutionRunner();
        runner.accept(stream -> stream.count());
    }

}
