import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void getLinks(){
        List<String> links = List.of("https://something.com", "some-page.html");
        assertEquals(links, MarkdownParse.getLinks("test-file.md"));
    }
}