    package HomeWork_1;

    import java.io.File;
    import java.io.IOException;
    import java.nio.file.Files;
    import java.nio.file.Path;
    import java.nio.file.Paths;
    import java.util.Objects;


    public class Example {
        public static void main(String[] args) throws IOException {
            Path basePath = Paths.get("homework");
            Path targetPath = Paths.get("backup");
            if(!targetPath.toFile().exists()) Files.createDirectory(targetPath);

            for (File f : Objects.requireNonNull(basePath.toFile().listFiles())){
                Path newPath = targetPath.resolve(basePath.relativize(f.toPath()));
                if(f.isFile() && !newPath.toFile().exists()) Files.copy(f.toPath(),newPath);
            }



        
    }
}