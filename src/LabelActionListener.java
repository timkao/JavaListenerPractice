import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabelActionListener implements ActionListener {
    private JLabel label;

    LabelActionListener(JLabel mylabel) {
        label = mylabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("label changed");
    }
}
