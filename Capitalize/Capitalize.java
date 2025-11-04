import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length != 2) {
            return;
        }

        Path inputFile = Path.of(args[0]);
        Path outputFile = Path.of(args[1]);

        try {
            String content = Files.readString(inputFile);
            String[] words = content.trim().split("\\s+");
            for (int i = 0; i < words.length; i++) {
                String w = words[i];
                if (!w.isEmpty()) {
                    words[i] = Character.toUpperCase(w.charAt(0)) + w.substring(1).toLowerCase();
                }
            }
            String result = String.join(" ", words);
            Files.writeString(outputFile, result);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
