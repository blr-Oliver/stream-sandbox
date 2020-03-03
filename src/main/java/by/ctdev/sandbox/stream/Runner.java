package by.ctdev.sandbox.stream;

import java.util.stream.Stream;

import by.ctdev.sandbox.stream.boilerplate.BankStreamer;

public class Runner {

  public static void main(String[] args) {
    BankStreamer streamer = new BankStreamer("/by/ctdev/sandbox/stream/banks.csv");
    doMagic(streamer.stream());
  }

  public static void doMagic(Stream<Bank> banks) {

  }

}
