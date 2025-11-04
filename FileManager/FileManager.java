import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        Path filepath = Path.of(fileName);
        try{
            Files.writeString(filepath,content);
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
    public static String getContentFile(String fileName) throws IOException {
        Path filepath = Path.of(fileName);
         byte[] content = new byte[0];
        try{
            content = Files.readAllBytes(filepath);
        }catch (IOException e){
            System.err.println(e.getMessage());
            throw e ;
        }
        return new String(content);     
    }
    public static void deleteFile(String fileName) {
        Path path = Path.of(fileName);
        try{
            Files.delete(path);
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}