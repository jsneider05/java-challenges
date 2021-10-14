package com.java.challenges.stream;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class Challenge2QuadrupletsSumNumberTest {

  @Test
  void testCase1() {
    // Given
    int[] array = {7, 6, 4, -1, 1, 2};
    int targetSum = 16;

    // When
    List<Integer[]> output = Challenge2QuadrupletsSumNumber.fourNumberSum(array, targetSum);

    // Then
    assertThat(output)
        .isNotEmpty()
        .hasSize(2)
        .containsOnly(
            new Integer[]{7, 6, 4, -1},
            new Integer[]{7, 6, 1, 2}
        );
  }

  @Test
  void testCase2() {
    // Given
    int[] array = {1, 2, 3, 4, 5, 6, 7};
    int targetSum = 10;

    // When
    List<Integer[]> output = Challenge2QuadrupletsSumNumber.fourNumberSum(array, targetSum);

    // Then
    assertThat(output)
        .isNotEmpty()
        .hasSize(1)
        .containsOnly(
            new Integer[]{1, 2, 3, 4}
        );
  }

  @Test
  void testCase3() {
    // Given
    int[] array = {5, -5, -2, 2, 3, -3};
    int targetSum = 0;

    // When
    List<Integer[]> output = Challenge2QuadrupletsSumNumber.fourNumberSum(array, targetSum);

    // Then
    assertThat(output)
        .isNotEmpty()
        .hasSize(3)
        .containsOnly(
            new Integer[]{5, -5, -2, 2},
            new Integer[]{5, -5, 3, -3},
            new Integer[]{-2, 2, 3, -3}
        );
  }

  @Test
  void testCase4() {
    // Given
    int[] array = {-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int targetSum = 4;

    // When
    List<Integer[]> output = Challenge2QuadrupletsSumNumber.fourNumberSum(array, targetSum);

    // Then
    assertThat(output)
        .isNotEmpty()
        .hasSize(4)
        .containsOnly(
            new Integer[]{-2, -1, 1, 6},
            new Integer[]{-2, 1, 2, 3},
            new Integer[]{-2, -1, 2, 5},
            new Integer[]{-2, -1, 3, 4}
        );
  }

  @Test
  void testCase5() {
    // Given
    int[] array = {-1, 22, 18, 4, 7, 11, 2, -5, -3};
    int targetSum = 30;

    // When
    List<Integer[]> output = Challenge2QuadrupletsSumNumber.fourNumberSum(array, targetSum);

    // Then
    assertThat(output)
        .isNotEmpty()
        .hasSize(5)
        .containsOnly(
            new Integer[]{-1, 22, 7, 2},
            new Integer[]{22, 4, 7, -3},
            new Integer[]{-1, 18, 11, 2},
            new Integer[]{18, 4, 11, -3},
            new Integer[]{22, 11, 2, -5}
        );
  }

  @Test
  void testCase6() {
    // Given
    int[] array = {-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5};
    int targetSum = 20;

    // When
    List<Integer[]> output = Challenge2QuadrupletsSumNumber.fourNumberSum(array, targetSum);

    // Then
    assertThat(output)
        .isNotEmpty()
        .hasSize(7)
        .containsOnly(
            new Integer[]{-5, 2, 15, 8},
            new Integer[]{-3, 2, -7, 28},
            new Integer[]{-10, -3, 28, 5},
            new Integer[]{-10, 28, -6, 8},
            new Integer[]{-7, 28, -6, 5},
            new Integer[]{-5, 2, 12, 11},
            new Integer[]{-5, 12, 8, 5}
        );
  }

  @Test
  void testCase7() {
    // Given
    int[] array = {1, 2, 3, 4, 5};
    int targetSum = 100;

    // When
    List<Integer[]> output = Challenge2QuadrupletsSumNumber.fourNumberSum(array, targetSum);

    // Then
    assertThat(output)
        .isEmpty();
  }

  @Test
  void testCase8() {
    // Given
    int[] array = {1, 2, 3, 4, 5, -5, 6, -6};
    int targetSum = 5;

    // When
    List<Integer[]> output = Challenge2QuadrupletsSumNumber.fourNumberSum(array, targetSum);

    // Then
    assertThat(output)
        .isNotEmpty()
        .hasSize(6)
        .containsOnly(
            new Integer[]{2, 3, 5, -5},
            new Integer[]{1, 4, 5, -5},
            new Integer[]{2, 4, 5, -6},
            new Integer[]{1, 3, -5, 6},
            new Integer[]{2, 3, 6, -6},
            new Integer[]{1, 4, 6, -6}
        );
  }

}