/**
 * Get last numeral of big fibonacci number.
 * <p>
 * Example:
 * Input: n = 123456789
 * Output:4
 * </p>
 */
public class BigFibonacci {

    public static int getLastNumeralOfBigFibonacci(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 10;
        }
        return arr[n];
    }
}
