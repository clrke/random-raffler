import javax.swing.*;
import java.awt.*;
import java.util.List;

public class RandomRafflerFrame extends JFrame {

    private RandomRafflerButton randomRafflerButton;

    public RandomRafflerFrame(List<String> entries) {
        this.randomRafflerButton = new RandomRafflerButton(entries);

        this.setMinimumSize(new Dimension(400, 400));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1, 1));
        this.add(randomRafflerButton);
    }
}
