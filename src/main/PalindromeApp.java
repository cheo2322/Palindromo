package main;

public class PalindromeApp {

  public static void main(String[] args) {
    int n = 31;
    System.out.println(smallestPalindrome(n));

    n = 456789;
    System.out.println(smallestPalindrome(n));
  }

  public static int smallestPalindrome(int n) {
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