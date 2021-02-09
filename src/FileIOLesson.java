import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLesson {
    public static void main(String[] args) throws IOException {
        String directory = "src";
        String fileName = "Languages.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, fileName);

        if(Files.notExists(dataDirectory)){
            Files.createDirectories(dataDirectory);
        }

        if(!Files.exists(dataFile)){
            Files.createFile(dataFile);
        }

        List<String> languages = Arrays.asList("jJava");

        Files.write(dataFile, languages);



    }
}
