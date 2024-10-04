package leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TrappingWaterTest {
    @Test
    public void shouldReturnTotalWater() {
        assertThat(TrappingRainwater.getResult(new int[]{ 0,1,0,2,1,0,1,3,2,1,2,1 })).isEqualTo(6);
        assertThat(TrappingRainwater.getResult(new int[]{ 4,2,0,3,2,5 })).isEqualTo(9);
        assertThat(TrappingRainwater.getResult(new int[]{ 4,2 })).isEqualTo(0);
    }
}
