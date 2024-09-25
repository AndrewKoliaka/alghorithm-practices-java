package dailyCodingProblem;

import dailyCodingProblem.arrays.BuildingsWithSunsetView;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuildingsWithSunsetViewTest {

    @Test
    public void shouldReturnTheCorrectCount() {
        assertEquals(BuildingsWithSunsetView.getBuildingsCount(new int[]{3, 7, 8, 3, 6, 1}), 3);
        assertEquals(BuildingsWithSunsetView.getBuildingsCount(new int[]{1}), 1);
        assertEquals(BuildingsWithSunsetView.getBuildingsCount(new int[]{}), 0);
    }
}
