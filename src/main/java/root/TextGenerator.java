package root;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class TextGenerator {
    public static String generatorText() {
        String result = "";
        String text = "src/main/resources/textgenerator.txt";
        Random r = new Random();
        try {
            Object[] texts = Files.readAllLines(Paths.get(text)).toArray();
            result = texts[r.nextInt(texts.length)].toString();
        } catch (Exception e) {
        }
        return result + " " + result + " " + result;
    }

}
