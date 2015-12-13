import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(new File("entries.txt")));
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: entries.txt does not exist!");
        }
        List<String> entries = new ArrayList<String>();

        String line;
        try {
            while ((line = reader.readLine()) != null) {
                if (!line.equals("")) {
                    entries.add(line);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong with reading the " +
                    "entries file. Please try again.");
        }

        RandomRafflerFrame randomRafflerFrame = new RandomRafflerFrame(entries);
        randomRafflerFrame.setVisible(true);
    }
}
