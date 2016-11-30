import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by ${SzilviaB} on 2016. 11. 25..
 */
public class GUI extends JFrame implements ActionListener, MouseListener {

    private JFrame frame1;
    private JPanel panel1;
    private JPanel panel2;
    private JTextField inputField;
    private JTextArea listingArea;
    private JButton add;
    private JButton remove;
    private JButton removeAll;
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
        listingArea.setEditable(false);
        listingArea.setMaximumSize(new Dimension(450, 300));

        panel1.add(inputField);
        panel1.add(listingArea);


        add = new JButton("Add Task");
        remove = new JButton("Remove Task");
        complete = new JButton("Complete Task");
        load = new JButton("Load Tasks");
        save = new JButton("Save");
        removeAll = new JButton("Remove All");

        panel2.add(add);
        panel2.add(remove);
        panel2.add(complete);
        panel2.add(load);
        panel2.add(save);
        panel2.add(removeAll);

        inputField.addActionListener(this);
        inputField.addMouseListener(this);
        load.addActionListener(this);
        add.addActionListener(this);
        remove.addActionListener((ActionListener)this);
        complete.addActionListener((ActionListener)this);
        save.addActionListener(this);
        removeAll.addActionListener(this);

    }

    public void printToArea(String text) {
        listingArea.append(text + "\n");
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
        panel2.setLayout(new GridLayout(2,1,10,8));
        panel2.setBorder(BorderFactory.createEmptyBorder(0, 20, 40, 20));

    }

    private void createFrame() {
        frame1 = new JFrame("ToDo List");
        BorderLayout myLayout = new BorderLayout();
        frame1.setLayout(myLayout);

        frame1.setPreferredSize(new Dimension(500, 400));
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
        if (e.getSource() == load) {
            printToArea(tasks.getList());
        }
        else if (e.getSource() == inputField){
            listingArea.setText(null);
            tasks.add(inputField.getText());
            inputField.setText("");
            printToArea(tasks.getList());
        }

        else if (e.getSource() == add) {
            listingArea.setText(null);
            tasks.add(inputField.getText());
            inputField.setText("");
            printToArea(tasks.getList());
        }

        else if (e.getSource() == remove){
            listingArea.setText(null);
            int y = Integer.parseInt(inputField.getText());
            tasks.remove(y);
            inputField.setText("");
            printToArea(tasks.getList());
        }

        else if (e.getSource() == complete){
            listingArea.setText(null);
            int z = Integer.parseInt(inputField.getText());
            tasks.complete(z);
            inputField.setText("");
            printToArea(tasks.getList());
        }

        else if (e.getSource() == save){
            tasks.writeList();
        }

        else if (e.getSource() == removeAll){
            listingArea.setText("");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        inputField.setText("");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
