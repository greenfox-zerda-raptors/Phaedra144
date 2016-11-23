import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ${SzilviaB} on 2016. 11. 23..
 */
public class Counter extends JFrame implements ActionListener {

    private JButton buttonCounter, buttonReset;
    private JLabel labelCounter;
    private int clicks;

    public Counter() {
        clicking();
        this.setTitle("Click me");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    private void clicking() {
        JPanel panel = new JPanel();
        this.add(panel);

        buttonCounter = new JButton("Press me!");
        panel.add(buttonCounter);
        buttonCounter.addActionListener(this);

        buttonReset = new JButton("Reset");
        panel.add(buttonReset);
        buttonReset.addActionListener(this);

        labelCounter = new JLabel();
        panel.add(labelCounter);
        labelCounter.setSize(new Dimension(200, 30));
        updateCounter();
    }

    private void updateCounter() {
        labelCounter.setText("Pressed: " + clicks);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Counter().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) { //*(Action Event = esemeny, ami akkor keletkezik, amikor megnyomjuk a gombot, milyen esemeny
        if (e.getSource() == buttonReset) {
            clicks = 0;
            updateCounter();
        }
        else {
            clicks++;
            updateCounter();
        }

    }
}
