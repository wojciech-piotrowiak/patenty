import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Patenty2 {

    @Test
    public void memoryCheck() {
        System.out.println(ObjectSizeCalculator.getObjectSize(null));
        System.out.println(ObjectSizeCalculator.getObjectSize(new Object()));
        System.out.println(ObjectSizeCalculator.getObjectSize("ABCD"));
        System.out.println(ObjectSizeCalculator.getObjectSize(true));
        System.out.println(ObjectSizeCalculator.getObjectSize(3));
        System.out.println(ObjectSizeCalculator.getObjectSize('A'));
    }

    @Test
    public void joiningTest() {
        assertEquals("1<2<3",Stream.of("1", "2", "3").collect(Collectors.joining("<")));
    }
}
