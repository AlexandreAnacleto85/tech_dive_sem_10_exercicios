package datas;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Exercicio06 {
    public static void main(String[] args) {
        Path path = Paths.get("src/datas/arq.txt");
        try {
            double bytes = Files.size(path);
            System.out.println(bytes + " bytes");
            System.out.println(bytes/10e2 + " kB");
            System.out.println(bytes/10e5 + " MB");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
