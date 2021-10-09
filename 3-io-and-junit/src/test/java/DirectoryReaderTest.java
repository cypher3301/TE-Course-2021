import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class DirectoryReaderTest {

    @Test
    void read() {

        try {
            File file = new File("./");
            new DirectoryReader().read(file);
        } catch (Exception e) {
            e.printStackTrace();
            assert false;
        }
        assert true;
    }
}