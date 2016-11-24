import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ${SzilviaB} on 2016. 11. 23..
 */
public class UI_Controls extends JFrame implements ActionListener {

    JLabel input;
    JLabel memory;
    JTextField text;
    JButton clear;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UI_Controls();
            }
        });
    }

    public UI_Controls() {
        this.setTitle("UI Controls sample");

        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        JPanel panel = new JPanel();
        this.add(panel);

        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);
        panel.setBorder(BorderFactory.createMatteBorder(40, 40, 40, 40, panel.getBackground()));

        text = new JTextField("My actual input");
        panel.add(text);
        text.addActionListener(this);

        Box.createRigidArea(new Dimension(0, 20));
        input = new JLabel("Text: ");
        panel.add(input);
        memory = new JLabel("Memory: ");
        panel.add(memory);
        Box.createRigidArea(new Dimension(0, 20));
        clear = new JButton("Clear memory");
        panel.add(clear);
        clear.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == text) {
            StringBuilder sb = new StringBuilder(input.getText());
            sb.delete(0, 5);
            memory.setText("Memory: " + sb);
            input.setText("Text: " + text.getText());
        }
        else {
            memory.setText("Memory: ");

        }
    }
}
