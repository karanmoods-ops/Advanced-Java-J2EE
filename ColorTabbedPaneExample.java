package A5;
import java.awt.Color;
import javax.swing.*;

public class ColorTabbedPaneExample {

    JFrame f;

    ColorTabbedPaneExample() {
        f = new JFrame("Tabbed Pane Example");

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.MAGENTA);
        p3.setBackground(Color.YELLOW);

        JTabbedPane tp = new JTabbedPane();

        tp.add("CYAN", p1);
        tp.add("MAGENTA", p2);
        tp.add("YELLOW", p3);

        f.add(tp);

        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ColorTabbedPaneExample();
    }
} 