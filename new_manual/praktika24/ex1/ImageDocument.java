import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ImageDocument implements IDocument {
    public ImageDocument() throws IOException {
        Files.createFile(Path.of("/home/georgechuff/IdeaProjects/praktika24_new/image.jpg"));
        System.out.println("jpg был создан jpg файл");
    }
}