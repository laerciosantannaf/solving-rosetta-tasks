package math.integers.basics.arithmetic.integer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArithmeticInteger {
  public static void main(String[] args) throws IOException {
    final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter 2 (two) integers separated by space(s): ");
    final String input = reader.readLine().replaceAll("\\s{2,}", " ");

    final List<String> inputsStr = Stream.of(input.split("\\s")).collect(Collectors.toList());
    final List<Integer> inputsInt = new ArrayList<>(0);

    inputsStr.forEach(i -> inputsInt.add(Integer.valueOf(i)));
    final int sum = Math.addExact(inputsInt.get(0), inputsInt.get(1));
    final String resultSum = String.format("Result of the sum: %s", sum);
    System.out.println(resultSum);

    final int diff = Math.subtractExact(inputsInt.get(0), inputsInt.get(1));
    final String resultDifference = String.format("Result of the difference: %s", diff);
    System.out.println(resultDifference);

    final int times = Math.multiplyExact(inputsInt.get(0), inputsInt.get(1));
    final String resultProduct = String.format("Result of the product: %s", times);
    System.out.println(resultProduct);

    final int quo = (inputsInt.get(0) / inputsInt.get(1));
    final String resultIntegerQuotient = String.format("Result of the integer quotient: %s", quo);
    System.out.println(resultIntegerQuotient);

    final int rem = Math.floorMod(inputsInt.get(0), inputsInt.get(1));
    final String resultRemainders = String.format("Result of the remainders: %s", rem);
    System.out.println(resultRemainders);

    final int exp = (int) Math.pow(inputsInt.get(0), inputsInt.get(1));
    final String resultExponentiation = String.format("Result of the exponentiation: %s", exp);
    System.out.println(resultExponentiation);
  }
}
