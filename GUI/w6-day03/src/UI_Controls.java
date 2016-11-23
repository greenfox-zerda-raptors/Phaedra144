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
        this.setVisible(true);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        this.add(panel);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setAlignmentX(CENTER_ALIGNMENT);

        text = new JTextField("My first input");
        panel.add(text);
        text.addActionListener(this);
        text.setMaximumSize();

        input = new JLabel("Text: ");
        panel.add(input);
        memory = new JLabel("Memory: ");
        panel.add(memory);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        StringBuilder sb = new StringBuilder(input.getText());
        sb.delete(0, 5);
        memory.setText("Memory: " + sb);
        input.setText("Text: " + text.getText());


    }
}
