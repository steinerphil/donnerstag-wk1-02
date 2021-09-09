import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",
            "2, 2",
            "3, 6",
            "4, 24"
    })

    void test(int given, int expected){

        //WHEN
        int check = Main.calculate(given);
        //THEN
        assertEquals(expected, check);
    }
}
