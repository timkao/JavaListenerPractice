import javax.swing.*;
import java.awt.*;

public class SimplePanel extends JPanel {
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        Color startColor = new Color(red, green, blue);

        int redEnd = (int) (Math.random() * 256);
        int greenEnd = (int) (Math.random() * 256);
        int blueEnd = (int) (Math.random() * 256);
        Color endColor = new Color(redEnd, greenEnd, blueEnd);

        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);

    }
}
