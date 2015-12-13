import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RaffleTimerListener implements ActionListener {
    private RandomRafflerButton randomRafflerButton;

    public RaffleTimerListener(RandomRafflerButton randomRafflerButton) {
        this.randomRafflerButton = randomRafflerButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.randomRafflerButton.nextEntry();
    }
}
