import org.junit.jupiter.api.Test;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class PathTest {
    @Test
    public void testFileHardcodedPath() {
        Path path = Paths.get("src", "main", "resources", "data.txt");
        File file = path.toFile();

        assertTrue(file.exists(), "File should be existed on all operating system!");
    }
}

