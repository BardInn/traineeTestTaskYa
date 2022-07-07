import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class WithProblemsTests {

    private String cons = "const";    //убрала final, чтобы присваивание ниже работало
    private final static String bd = "pui";

    @Test
    public void equalsStringOneToOne(){
        assertEquals("1", "1");
    }


    @Test
    public void assignValueToConstVar(){
        cons = "newValue";
        assertEquals("newValue", cons);
    }

    @Test
    public static void equalsOneToOne(){
        assertEquals(1, 1);
    }



    @Test
    public void stringsMustBeEquals(){
        String res = "a";

        if (bd.equals("pui")) {
            res = "asd";
        }

        assertEquals("asd", res);
    }

   @Test
    public void successfullyRemovingFirstElementFromList(){
        List<String> sourceData = List.of("1", "viskas", "chupocabra");
        sourceData = sourceData.stream().skip(1).collect(Collectors.toList());
        assertFalse(sourceData.contains("1"));
    }


}
