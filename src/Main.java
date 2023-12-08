
import java.time.LocalTime;
import java.util.List;

public class Main {
    private final static int MAX_NUMBER = 100_000;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        final LocalTime start = LocalTime.now();
        final List<Integer> results = CollatzCalculator.collatzStepCalculateUpTo(MAX_NUMBER);
        final LocalTime end = LocalTime.now();

        System.out.println("Calaculated collatz steps for numbers 0 to " + MAX_NUMBER + " in " +
                end.minusSeconds(start.toSecondOfDay()).minusNanos(start.getNano()));
    }
}