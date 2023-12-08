package java;

/**
 * Class to calculate numbers around Collatz conjecture
 * <a href="https://en.wikipedia.org/wiki/Collatz_conjecture">Collatz Conjecture on Wikipedia</a>
 */
public class CollatzCalculator {
    public static long calculateNextNumber(final long priorNumber) {
        return priorNumber % 2 == 0 ? priorNumber / 2 : (priorNumber * 3) + 1;
    }

    public static long calculateCollatzSteps(final long number) {
        return number == 1 ? 0 : 1 + calculateCollatzSteps(calculateNextNumber(number));
    }
}
