import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReadFileTests {

    @Test
    public void secondLineShouldHabAlloha()throws IOException {
        String file ="src/test/resources/ReadFileTests.txt";
        List<String> lines =   Files.readAllLines(Paths.get(file));

        assertTrue(lines.get(1).toLowerCase(Locale.ROOT).contains("аллоха"));

    }
}
