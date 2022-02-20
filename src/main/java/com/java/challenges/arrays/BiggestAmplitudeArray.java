package com.java.challenges.arrays;

import java.util.stream.IntStream;

public class BiggestAmplitudeArray {

  public static void main(String[] args) {
//    int[] T0 = new int[] { -3, -14, -5, 7, 8, 42, 8, 3 };
    int[] T1 = new int[] { 2, -3, 3, 1, 10, 8, 2, 5, 13, -5, 3, -18 };
//    int[] T1 = new int[] { 13, 2, 3, 4, 1, 6, 11, 8, 2, 10, 11, 4 };
//    int[] T2 = new int[] { 26, 2, 3, 4, 1, 6, 11, 33, 2, 10, 11, 4 };
//    int[] T3 = new int[] { 13, 2, 3, 27, 1, 6, 11, 8, 2, 10, 11, 4 };
//    int[] T4 = new int[] { 13, 2, 3, 4, 1, 6, 11, 8, 2, 10, 11, 33 };

//    System.out.println(solution(T0));
    System.out.println(solution(T1));
//    System.out.println(solution(T2));
//    System.out.println(solution(T3));
//    System.out.println(solution(T4));
  }

  public static String solution(int[] T) {
    final String[] seasons = { "WINTER", "SPRING", "SUMMER", "AUTUMN" };
    final int numberOfSeasons = seasons.length;
    final long tempPerSeason = T.length / numberOfSeasons;
    int seasonIndex = 0;
    int maxDifference = -2000;
    int lastDifference = maxDifference;
    for (int index = 0; index < numberOfSeasons; ++index) {
      int max = calculateRange(T, tempPerSeason, index).max().getAsInt();
      int min = calculateRange(T, tempPerSeason, index).min().getAsInt();
      int difference = max - min;
      if (difference > lastDifference) {
        seasonIndex = index;
        lastDifference = difference;
      }
    }
    return seasons[seasonIndex];
  }

  private static IntStream calculateRange(int[] T, long tempPerSeason, int index) {
    return IntStream.of(T).skip(tempPerSeason * index).limit(tempPerSeason);
  }

}
