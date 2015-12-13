import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class HugeLabelMouseListener implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        RandomRafflerButton randomRafflerButton = (RandomRafflerButton) e.getSource();

        if (randomRafflerButton.isChoosing()) {
            randomRafflerButton.stopWithEntry();
        } else if ( ! randomRafflerButton.getEntries().isEmpty()) {
            randomRafflerButton.startChoosing();
        } else {
            randomRafflerButton.setText("Everyone's a winner!");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
