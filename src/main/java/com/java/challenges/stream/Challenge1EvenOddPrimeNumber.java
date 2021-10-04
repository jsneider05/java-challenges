package com.java.challenges.stream;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Challenge1EvenOddPrimeNumber {

  public Map<String, Set<Integer>> computeEvenOddPrime(List<Integer> numbers) {

    Map<String, Set<Integer>> numbersComputed = numbers.stream()
        .collect(
            Collectors.groupingBy(evenOddFunction,
                Collectors.toCollection(LinkedHashSet::new))
        );

    Set<Integer> primes = numbersComputed.get("ODD")
        .stream()
        .filter(isPrime)
        .collect(Collectors.toCollection(LinkedHashSet::new));

    numbersComputed.get("EVEN").stream()
        .filter(n -> n.equals(2))
        .findFirst()
        .ifPresent(primes::add);

    numbersComputed.put("PRIME",
        primes.stream()
            .sorted()
            .collect(Collectors.toCollection(LinkedHashSet::new)));

    return numbersComputed;
  }

  Function<Integer, String> evenOddFunction = n -> n % 2 == 0 ? "EVEN" : "ODD";

  Predicate<Integer> isPrime = number ->
      number <= 2
          ? number == 2
          : IntStream.rangeClosed(2, number / 2)
              .noneMatch(i -> number % i == 0);

}
