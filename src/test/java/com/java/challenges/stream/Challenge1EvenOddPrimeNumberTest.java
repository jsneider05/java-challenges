package com.java.challenges.stream;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Challenge1EvenOddPrimeNumberTest {

  Challenge1EvenOddPrimeNumber underTest;

  @BeforeEach
  void setUp() {
    underTest = new Challenge1EvenOddPrimeNumber();
  }

  @Test
  void computeEvenOddPrimeSuccessTest() {
    // Given
    int start = 0;
    int end = 20;
    List<Integer> numbers = IntStream.rangeClosed(start, end)
        .boxed().collect(Collectors.toList());

    // When
    Map<String, Set<Integer>> evenOddPrimeNumbers = underTest.computeEvenOddPrime(numbers);

    // Then
    assertThat(evenOddPrimeNumbers)
        .isNotNull()
        .hasSize(3)
        .containsOnlyKeys("PRIME", "EVEN", "ODD")
        .containsExactly(
            Map.entry("PRIME", Set.of(2, 3, 5, 7, 11, 13, 17, 19)),
            Map.entry("EVEN", Set.of(0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20)),
            Map.entry("ODD", Set.of(1, 3, 5, 7, 9, 11, 13, 15, 17, 19))
        );

  }
}