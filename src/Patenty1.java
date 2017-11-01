import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Patenty1 {

    @Test
    public void patent1() throws Exception {
        List empty = null;
        List<String> strings = Arrays.asList("one", "two", "three");
        printIt(empty);
        printIt(strings);
    }

    private void printIt(List<String> list) {
        Optional.ofNullable(list).ifPresent(collection -> collection.forEach(System.out::println));
    }

    @Test
    public void patent2() throws Exception {
        OptionalInt optionalInt = OptionalInt.of(1);
        printInt(optionalInt.orElseThrow(Exception::new));
    }

    private void printInt(int a) {
        System.out.println(a);
    }

    @Test
    public void patent3() throws Exception {
        System.out.println(String.format("%s %s %S", "ABC", "abc", "abc"));
        System.out.println(String.format("%1$s %2$s %2$S", "ABC", "abc"));

    }
}

