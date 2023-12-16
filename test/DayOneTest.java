import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrebuchetTest {

    @Test
    public void testOneDigit() {
        DayOne t = new DayOne();
        List<Integer> num = t.decode("digit1digit");
        assertAll(
                () -> assertEquals(1, num.size()),
                () -> assertEquals(11, num.get(0))
        );
    }

    @Test
    public void testTwoDigits() {
        DayOne t = new DayOne();
        List<Integer> num = t.decode("digit12digit");
        assertAll(
                () -> assertEquals(1, num.size()),
                () -> assertEquals(12, num.get(0))
        );
    }
}
