import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import kotlin.test.junit5.JUnit5Asserter.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class QuickSortTest {
    @Test
    fun TestSortsArray() {
        // GIVEN
        val input: Array<Int> = arrayOf(10, 1, 20, 5, 4, 6, 7, 8)
        // WHEN
        val output: Array<Int> = quicksort(input)
        // THEN
        val ordered = arrayOf(1, 4, 5, 6, 7, 8, 10, 20)
        ordered.forEachIndexed { index, i ->
            assertEquals(
                "Position $index should be $i but got ${output[index]}", i, output[index]
            )
        }
    }
}
