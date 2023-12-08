package java;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class CollatzCalculatorTest {

    @org.junit.jupiter.api.Test
    void calculateNextNumberTest() {
        assertThat(CollatzCalculator.calculateNextNumber(2L), equalTo(1L));
        assertThat(CollatzCalculator.calculateNextNumber(3L), equalTo(10L));
        assertThat(CollatzCalculator.calculateNextNumber(4L), equalTo(2L));
        assertThat(CollatzCalculator.calculateNextNumber(5L), equalTo(16L));
    }

    @org.junit.jupiter.api.Test
    void getCollatzStepCountForNumberTest() {
        assertThat(CollatzCalculator.calculateCollatzSteps(1L), equalTo(0L));
        assertThat(CollatzCalculator.calculateCollatzSteps(2L), equalTo(1L));
        assertThat(CollatzCalculator.calculateCollatzSteps(4L), equalTo(2L));
        assertThat(CollatzCalculator.calculateCollatzSteps(5L), equalTo(5L));
    }
}