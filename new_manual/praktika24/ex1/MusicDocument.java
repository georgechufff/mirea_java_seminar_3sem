import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MusicDocument implements IDocument{
    public MusicDocument() throws IOException {
        Files.createFile(Path.of("/home/georgechuff/IdeaProjects/praktika24_new/music.mp3"));
        System.out.println("mp3 был создан файл");
    }
}