import javax.swing.*;
import java.awt.*;
import java.util.List;

public class RandomRafflerButton extends JButton {
    private Font font;
    private List<String> entries;
    private String entry;
    private int entryIndex;
    private boolean choosing;
    private Timer timer;

    public RandomRafflerButton(List<String> entries) {
        this.setText("Loading...");

        this.font = new Font("Verdana", Font.BOLD, 48);
        this.entries = entries;
        this.entry = "Click to start!";
        this.entryIndex = -1;
        this.choosing = false;
        this.timer = new Timer(100, new RaffleTimerListener(this));

        this.setText(entry);
        this.setFont(font);
        this.setForeground(Color.BLACK);
        this.addMouseListener(new HugeLabelMouseListener());
    }

    public List<String> getEntries() {
        return entries;
    }

    public boolean isChoosing() {
        return choosing;
    }

    public void startChoosing() {
        this.choosing = true;
        this.setForeground(Color.BLACK);

        timer.start();
    }

    public void nextEntry() {
        entryIndex = (entryIndex + 1) % entries.size();

        entry = entries.get(entryIndex);

        this.setText(entry);
    }

    public void stopWithEntry() {
        this.choosing = false;
        this.entries.remove(entryIndex);
        this.setForeground(Color.BLUE);

        timer.stop();
    }
}
