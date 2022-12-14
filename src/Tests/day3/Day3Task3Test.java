package Tests.day3;

import Tests.AbstractTest;
import Main.day3.Task3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Day3Task3Test extends AbstractTest {
    @Test
    public void ShouldWorkProperly() {
        setInput("4 2\n100 0\n13 10\n5 2\n0 0\n");
        Task3.main(new String[0]);
        assertEquals("2.0\nДеление на 0\n1.3\n2.5\nДеление на 0\n", getOutput(), "4 2     13 10     5 2     0 0");
    }

}
