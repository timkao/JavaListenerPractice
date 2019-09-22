import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui1 {
    JButton panelButton;
    JButton labelButton;
    SimplePanel panel;
    JLabel label;

    public static void main(String[] args) {
        SimpleGui1 gui = new SimpleGui1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        panel = new SimplePanel();
        label = new JLabel("This is the label");

        panelButton = new JButton("Paint it randomly");
        PanelActionListener panelActionListener = new PanelActionListener();
        panelButton.addActionListener(panelActionListener);

        labelButton = new JButton("Change Text");
        LabelActionListener labelActionListener = new LabelActionListener();
        labelButton.addActionListener(labelActionListener);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.SOUTH, panelButton);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.NORTH, label);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    class PanelActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            panel.repaint();
        }
    }

    class LabelActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("label changed");
        }
    }

}
