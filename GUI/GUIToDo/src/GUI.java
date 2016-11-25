import javax.swing.*;
import java.awt.*;

/**
 * Created by ${SzilviaB} on 2016. 11. 25..
 */
public class GUI extends JFrame {

    private JFrame frame1;
    private JPanel panel1;
    private JPanel panel2;
    private JTextField inputField;
    private JTextArea listingArea;
    private JButton add;
    private JButton remove;
    private JButton save;
    private JButton complete;


    public GUI() {
        createFrame();
        createMainPanel();
        addComponentsToMainPanel();
    }

    private void addComponentsToMainPanel() {

        listingArea = new JTextArea("Your ToDo list is empty");
        inputField = new JTextField("Write your new task here", 10);
        inputField.setMaximumSize(new Dimension(450, 20));

        panel1.add(inputField);
        Box.createRigidArea(new Dimension(0, 20));
        panel1.add(listingArea);


    }

    private void createMainPanel() {
        panel1 = new JPanel();
        panel1.setName("Main Panel");
        panel1.setLayout(new BorderLayout());
        frame1.add(panel1);
        BoxLayout boxLayout = new BoxLayout(panel1, BoxLayout.Y_AXIS);
        panel1.setLayout(boxLayout);
        panel1.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
    }

    private void createFrame() {
        frame1 = new JFrame("ToDo List");
        frame1.setPreferredSize(new Dimension(500, 500));
        frame1.setLocationRelativeTo(null);
        frame1.setResizable(false);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void display() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frame1.pack();

            }
        });
    }


}
