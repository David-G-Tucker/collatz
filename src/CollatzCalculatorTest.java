import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

class CollatzCalculatorTest {

    @Test
    void calculateNextNumberTest() {
        assertThat(CollatzCalculator.collatzStep(2), equalTo(1));
        assertThat(CollatzCalculator.collatzStep(3), equalTo(10));
        assertThat(CollatzCalculator.collatzStep(4), equalTo(2));
        assertThat(CollatzCalculator.collatzStep(5), equalTo(16));
    }

    @Test
    void getCollatzStepCountForNumberTest() {
        assertThat(CollatzCalculator.collatzStepCount(1), equalTo(0));
        assertThat(CollatzCalculator.collatzStepCount(2), equalTo(1));
        assertThat(CollatzCalculator.collatzStepCount(4), equalTo(2));
        assertThat(CollatzCalculator.collatzStepCount(5), equalTo(5));
    }
}