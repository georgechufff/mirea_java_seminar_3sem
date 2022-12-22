import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextDocument implements IDocument{
    public TextDocument() throws IOException {
        Files.createFile(Path.of("/home/georgechuff/IdeaProjects/praktika24_new/text.txt"));
        System.out.println("Txt-файл был создан");
    }
}