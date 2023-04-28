/**
 * Reversing a number in O(1) memory involves:
 *
 * <ol>
 *   <li>Allocating an int variable to hold the reversed value with initial value of 0</li>
 *   <li>Until the provided value is not 0 (to support both negative/positive values) -> get the ones digit (n % 10) and get rid of it (n = n / 10)</li>
 *   <li>For each such digit we multiply the reversed var (initially 0) by 10 each time and add it, which puts it at the end</li>
 * </ol>
 *
 * Time Complexity: O(n) where n = value.length
 * Space Complexity: O(1)
 */
public class Main {
  public static int reverse(int value) {
    int reversed = 0;

    while (value != 0) {
      reversed = reversed * 10 + (value % 10);
      value = value / 10;
    }

    return reversed;
  }
}
