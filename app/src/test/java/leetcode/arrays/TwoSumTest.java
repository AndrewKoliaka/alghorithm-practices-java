package leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoSumTest {
    @Test
    public void shouldReturnTheCorrectCount() {
        assertThat(TwoSum.getSum(new int[]{ 2, 7, 11, 15 }, 9)).isEqualTo(new int[]{ 0, 1 });
        assertThat(TwoSum.getSum(new int[]{ 3, 2, 4 }, 6)).isEqualTo(new int[]{ 1, 2 });
        assertThat(TwoSum.getSum(new int[]{ 3, 3 }, 6)).isEqualTo(new int[]{ 0, 1 });
        assertThat(TwoSum.getSum(new int[]{ 1, 2, 3 }, 25)).isEqualTo(null);
    }
}
