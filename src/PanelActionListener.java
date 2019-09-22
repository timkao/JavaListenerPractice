import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelActionListener implements ActionListener {
    private SimplePanel panel;

    PanelActionListener(SimplePanel simplePanel) {
        panel = simplePanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panel.repaint();
    }
}
