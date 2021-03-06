import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortingTest {

    @Test
    public void should_sorting_by_asc() {
        int[] data = {10, 3, 29, 199, 10};

        BubbleSorting bubbleSorting = new BubbleSorting();
        int[] result = bubbleSorting.bubble(data);
        int[] expectedResult = {3, 10, 10, 29, 199};

        assertArrayEquals(expectedResult, result);
    }
}
