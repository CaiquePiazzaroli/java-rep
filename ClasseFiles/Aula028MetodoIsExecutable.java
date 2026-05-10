package ClasseFiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aula028MetodoIsExecutable {
    public static void main(String[] args) {

        Path script = Paths.get("/usr/local/bin/deploy.sh");

        boolean executavel = Files.isExecutable(script);

        System.out.println(executavel);
    }
}
