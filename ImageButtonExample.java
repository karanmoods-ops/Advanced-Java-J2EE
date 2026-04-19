package A4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ImageButtonExample {
    JLabel label;

    ImageButtonExample() {
        JFrame frame = new JFrame("Image Button Example");

        label = new JLabel();
        label.setBounds(50, 50, 400, 50);

        // Load images (place images in same folder or give full path)
        ImageIcon clockIcon = new ImageIcon("clock.jpg");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.jpg");

        JButton btnClock = new JButton(clockIcon);
        JButton btnHourglass = new JButton(hourglassIcon);

        btnClock.setBounds(50, 120, 150, 150);
        btnHourglass.setBounds(220, 120, 150, 150);

        // Action for Digital Clock button
        btnClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        // Action for Hour Glass button
        btnHourglass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        frame.add(btnClock);
        frame.add(btnHourglass);
        frame.add(label);

        frame.setSize(450, 350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}