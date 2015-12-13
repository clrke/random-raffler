import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("entries.txt")));
        List<String> entries = new ArrayList<String>();

        String line;
        while ((line = reader.readLine()) != null) {
            if (!line.equals("")) {
                entries.add(line);
            }
        }

        RandomRafflerFrame randomRafflerFrame = new RandomRafflerFrame(entries);
        randomRafflerFrame.setVisible(true);
    }
}
