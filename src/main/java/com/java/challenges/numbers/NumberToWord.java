package com.java.challenges.numbers;

public class NumberToWord {

  /**
   * Create a method that accepts an integer object that represents a year, and returns the English
   * naturalized wording for that year.
   * <p>
   * ie. 0 = "Zero" ie. 5 = "Five" ie. 22 = "Twenty Two" ie. 1984 = "Nineteen eighty four" ie. 2020
   * = "twenty twenty" ie. 1743 != "One thousand seven hundred and fourty three" ie. 1743 =
   * "Seventeen Forty Three"
   * <p>
   * method signature: public String convert( Integer year ) { ... }
   */

  private static String[] numbers = {
    "Zero", "One", "Two", "nineteen"
  };

  private static String[] numbers10 = {
      "", "Ten", "Twenty", "eighty"
  };

  public static String convert(int number) {

    String word = "";
    // 1 to 20
    if (number < 20) {
      word = numbers[number];
    } else if (number < 100) {
      int firstNumber = number / 10;
      int secondNumber = number % 10;
      word = numbers10[secondNumber] + " " + numbers[firstNumber];
    }
    return word;
  }

  public static void main(String[] args) {
    System.out.println(convert(22));
  }


}
