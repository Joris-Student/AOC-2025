import java.io.BufferedReader;
import java.io.IOException;

public class FileInputReader {
    public static void readFiles() {
        try (BufferedReader br = new BufferedReader(new java.io.FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                char currentDirection = line.charAt(0);
                int currentDialRotations = Integer.parseInt(line.substring(1));
                
                DialHandler.calculateDialPosition(currentDirection, currentDialRotations);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
