import org.junit.jupiter.api.Test;

public class Patenty3 {

    @Test
    public void propertiesList(){
        System.getProperties().forEach((key,val)->System.out.println(key+": "+val));
    }

    @Test
    public void envList(){
        System.getenv().forEach((key,val)->System.out.println(key+": "+val));
    }

    @Test
    public void systemUser(){
        System.out.println(System.getenv("USER"));
    }
}
