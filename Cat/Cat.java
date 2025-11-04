import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException; 
public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args.length == 0){
            System.out.print("");
            return;
        }
        String content = Files.readString(Paths.get(args[0]));
        System.out.println(content);
    }
}