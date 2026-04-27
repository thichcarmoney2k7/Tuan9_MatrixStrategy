import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class PathTest {
    @Test
    public void testFileHardcodedPath() {
        String path = "src\\main\\resources\\data.txt";
        File file = new File(path);

        assertTrue(file.exists(), "File exists, But the path might be wrong on this operating system.!");
    }
}

