import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
       if (args.length != 2){
        return;
       }
    Path path = Path.of(args[0]);
    Path path2 = Path.of(args[1]);
    try{
        byte[] content = Files.readAllBytes(path);
    Files.write(path2 , content);
    }catch(IOException e){
        System.err.println(e.getMessage());
    }
    }
}