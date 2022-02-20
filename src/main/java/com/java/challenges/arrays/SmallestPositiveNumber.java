package com.java.challenges.arrays;

import java.util.Arrays;

public class SmallestPositiveNumber {

  public static void main(String[] args) {
    int solution = solution(new int[]{1, 3, 6, 4, 1, 2});
    System.out.println(solution);
  }

  public static int solution(int[] a) {
    int x = 1;
    // write your code in Java SE 8
    Integer[] collect = Arrays.stream(a)
        .filter(number -> number >= 1)
        .sorted()
        .boxed()
        .toArray(Integer[]::new);
//        .mapToLong(num -> Long.parseLong(String.valueOf(num)))
//        .collect(Collectors.toSet());

    for (Integer integer : collect) {
      if (x < integer) {
        return x;
      }
      x = integer + 1;

    }

    return x;
  }

}
