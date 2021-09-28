/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Makiya Thomas
 */

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("What is the rate of return? ");
      int number = input.nextInt();

      int years = 72 / number;

      while (number != 300) {
          if (number == 0) {
              System.out.print("Sorry. That's not a valid input.");

              System.out.print("\n What is the rate of return? ");
              int number2 = input.nextInt();
              number = number2;
          } else {
              System.out.printf("It will take %d years to double your initial investment.", years);
              break;
          }
      }
  }
}