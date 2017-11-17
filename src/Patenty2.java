import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Patenty2 {

    @Test
    public void joiningTest() {
        System.out.print(Stream.of("1", "2", "3").collect(Collectors.joining("<")));
    }
}
