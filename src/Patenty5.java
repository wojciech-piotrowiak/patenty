
import java.util.Objects;

public class Patenty5 {
    public static void main(String[] args) {
        System.out.println(Objects.toString(null, "default"));
        System.out.println(Objects.toString("text", "default"));
        System.out.println(Objects.isNull(null));
        //jdk 9
        //System.out.println(Objects.requireNonNullElse(null,"not null"));
        //System.out.println((Objects.requireNonNullElseGet(null,()->"other not null")));
    }
}
