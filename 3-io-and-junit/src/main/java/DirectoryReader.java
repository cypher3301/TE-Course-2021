import java.io.File;
import java.util.Arrays;
import java.util.Objects;

public class DirectoryReader {
    public void read(File file) {
        if (!file.isDirectory())
            System.out.println(file.getAbsolutePath());
        else {
            Arrays.stream(Objects.requireNonNull(file.listFiles())).forEach(this::read);
        }
    }
}
