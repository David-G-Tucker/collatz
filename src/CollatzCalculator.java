import java.util.ArrayList;
import java.util.List;

/**
 * Class to calculate numbers around Collatz conjecture
 * <a href="https://en.wikipedia.org/wiki/Collatz_conjecture">Collatz Conjecture on Wikipedia</a>
 */
public class CollatzCalculator {
    final static List<Integer> results = new ArrayList<>();

    public static int collatzStep(final int priorNumber) {
        return priorNumber % 2 == 0 ? priorNumber / 2 : (priorNumber * 3) + 1;
    }

    public static int collatzStepCount(final int number) {
        return number == 1 ? 0 : 1 + collatzStepCount(collatzStep(number));
    }

    public static int partOptimisedStepCount(final int number) {
        if (number < results.size()) return results.get(number);
        else return number == 1 ? 0 : 1 + collatzStepCount(collatzStep(number));
    }

    public static List<Integer> collatzStepCalculateUpTo(final long number) {
        results.add(1); //For zero a single step (*3 + 1) will take it to 1. Controversial as 0 is neither odd nor even.
        for(int thisNum = 1; thisNum <= number; thisNum++) {
            final int result = partOptimisedStepCount(thisNum);
            results.add(result);
            System.out.println(thisNum + " = " + result);
        }
        return results;
    }
}
