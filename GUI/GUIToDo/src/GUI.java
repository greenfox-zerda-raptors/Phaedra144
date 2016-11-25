import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ${SzilviaB} on 2016. 11. 25..
 */
public class GUI extends JFrame implements ActionListener {

    private JFrame frame1;
    private JPanel panel1;
    private JPanel panel2;
    private JTextField inputField;
    private JTextArea listingArea;
    private JScrollPane scrollPane;
    private JButton add;
    private JButton remove;
    private JButton save;
    private JButton complete;
    private JButton load;

    ToDoList tasks = new ToDoList();

    public GUI() {
        createFrame();
        createPanels();
        addComponentsToMainPanel();
    }

    private void addComponentsToMainPanel() {

        inputField = new JTextField("Write your new task here", 20);
        inputField.setMaximumSize(new Dimension(450, 20));
        inputField.setBorder(BorderFactory.createMatteBorder(0, 0, 20, 0, panel1.getBackground()));
        listingArea = new JTextArea();
        listingArea.setMaximumSize(new Dimension(450, 400));

        panel1.add(inputField);
        panel1.add(listingArea);


        add = new JButton("Add Task");
        remove = new JButton("Remove Task");
        complete = new JButton("Complete Task");
        load = new JButton("Load Tasks");
        save = new JButton("Save");

        panel2.add(add);
        panel2.add(remove);
        panel2.add(complete);
        panel2.add(load);
        panel2.add(save);

        load.addActionListener(this);
        add.addActionListener(this);

    }

    public void printToArea(String text) {
        listingArea.append(text + "\n");
    }

    public String getInput() {
        String input = inputField.getText();
        inputField.setCaretPosition(0);
        return input;
    }

    private void createPanels() {
        panel1 = new JPanel();
        panel1.setName("Panel for textfields");
        frame1.add(panel1, BorderLayout.NORTH);
        BoxLayout boxLayout = new BoxLayout(panel1, BoxLayout.Y_AXIS);
        panel1.setLayout(boxLayout);
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel2 = new JPanel();
        panel2.setName("Panel for buttons");
        frame1.add(panel2, BorderLayout.SOUTH);
        panel2.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 20));

    }

    private void createFrame() {
        frame1 = new JFrame("ToDo List");
        BorderLayout myLayout = new BorderLayout(3, 1);
        frame1.setLayout(myLayout);

        frame1.setPreferredSize(new Dimension(600, 600));
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);

//        frame1.setResizable(false);
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


    @Override
    public void actionPerformed(ActionEvent e) {
        printToArea(tasks.getList());

    }
}
