package com.java.challenges.stream;

import java.util.ArrayList;
import java.util.List;

public class Challenge2QuadrupletsSumNumber {

  /**
   * Sample Input
   *   array: [7 , 6,  4, -1, 1 ,2]
   *   targetSum = 16
   * Sample Output
   *   [[7, 6, 4, -1], [7, 6, 1, 2]]  // the quadruplets could be ordered differently
   */

  public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
    List<Integer[]> output = new ArrayList<>();
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        for (int k = j + 1; k < array.length; k++) {
          for (int l = k + 1; l < array.length; l++) {
            int sum = array[i] + array[j] + array[k] + array[l];
            if (sum == targetSum) {
              output.add(new Integer[]{array[i] , array[j] , array[k] , array[l]});
            }
          }
        }
      }
    }
    return output;
  }

}
