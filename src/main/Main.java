package main;

public class Main {

  public static void main(String[] args) {
    int n = 31;
    System.out.println(smallestPalindrome(n));
    if (smallestPalindrome(n) != 101) {
      throw new AssertionError();
    }

    n = 456789;
    System.out.println(smallestPalindrome(n));
    if (smallestPalindrome(n) != 1003001) {
      throw new AssertionError();
    }
  }

  private static int smallestPalindrome(int n) {
    if (n < 1 || n > 1000000) {
      throw new IndexOutOfBoundsException("n must be 1 <= n <= 1000000");
    }

    boolean flag = false;
    int candidate = n;

    while (!flag) {
      if (isPalindrome(candidate) && isPrime(candidate)) {
        flag = true;
      }
      candidate++;
    }
    return candidate - 1;
  }

  private static boolean isPalindrome(int m) {
    String number = String.valueOf(m);
    String reverse = new StringBuilder(number).reverse().toString();

    return number.equals(reverse);
  }

  private static boolean isPrime(int m) {
    int divisor = 2;
    while (divisor <= m / 2) {
      if (m % divisor == 0) {
        return false;
      }
      divisor++;
    }

    return true;
  }
}
