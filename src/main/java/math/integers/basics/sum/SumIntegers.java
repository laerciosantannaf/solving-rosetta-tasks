package math.integers.basics.sum;

import org.apache.commons.lang3.math.NumberUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumIntegers {

  private static final int MAX_NUMBER = 1000;
  private static final int MIN_NUMBER = -1000;

  public static void main(final String[] args) throws IOException {
    final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter 2 numbers (separated by space(s)): ");
    final String input = bufferedReader.readLine().replaceAll("\\s{2,}", " ");

    final List<String> numbersStr = Stream.of(input.split("\\s")).collect(Collectors.toList());
    final List<Integer> numbersInt = new ArrayList<>(0);

    for (String numberStr : numbersStr) {
      if (!NumberUtils.isCreatable(numberStr)) {
        System.err.println(String.format("The value %s is not a number", numberStr));
        System.exit(0);
      }
      final int number = Integer.parseInt(numberStr);
      if (number >= MIN_NUMBER && number <= MAX_NUMBER) numbersInt.add(number);
      else if (number <= MIN_NUMBER) {
        System.err.println(String.format("The number %s is less than %s", number, MIN_NUMBER));
        System.exit(0);
      } else {
        System.err.println(String.format("The number %s is greater than %s", number, MAX_NUMBER));
        System.exit(0);
      }
    }
    final int sum = numbersInt.get(0) + numbersInt.get(1);
    System.out.println(String.format("Result: %s", sum));
  }
}
