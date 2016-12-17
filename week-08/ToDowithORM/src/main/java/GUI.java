import javafx.scene.layout.Border;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

/**
 * Created by ${SzilviaB} on 2016. 11. 25..
 */
public class GUI extends JFrame implements ActionListener, MouseListener {

    private JFrame frame1;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JTextField inputField;
    private JLabel labelTask;
    private JLabel labelCreated;
    private JTextArea listingArea;
    private JButton add;
    private JButton remove;
    private JButton removeAll;
    private JButton save;
    private JButton complete;
    private JButton load;

    ToDoList tasks = new ToDoList();

    public GUI() throws SQLException {
        createFrame();
        createPanels();
        addComponentsToMainPanel();
    }

    private void addComponentsToMainPanel() {

        inputField = new JTextField("Write your new task here", 40);
        inputField.setPreferredSize(new Dimension(450, 20));

        labelTask = new JLabel("Task");


        labelCreated = new JLabel("Created");


        listingArea = new JTextArea();
        listingArea.setEditable(false);
        listingArea.setPreferredSize(new Dimension(450, 200));

        panel1.add(inputField);
        panel2.add(labelTask);
        panel2.add(labelCreated);
        panel3.add(listingArea);


        add = new JButton("Add Task");
        remove = new JButton("Remove Task");
        complete = new JButton("Complete Task");
        load = new JButton("Load Tasks");
        save = new JButton("Save");
        removeAll = new JButton("Remove All");

        panel4.add(add);
        panel4.add(remove);
        panel4.add(complete);
        panel4.add(load);
        panel4.add(save);
        panel4.add(removeAll);

        inputField.addActionListener(this);
        inputField.addMouseListener(this);
        load.addActionListener(this);
        add.addActionListener(this);
        remove.addActionListener((ActionListener) this);
        complete.addActionListener((ActionListener) this);
        save.addActionListener(this);
        removeAll.addActionListener(this);

    }

    public void printToArea(String text) {
        listingArea.append(text + "\n");
    }

    private void createPanels() {
        panel1 = new JPanel();
        panel1.setName("Panel for textfield");
        frame1.add(panel1);
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel1.setPreferredSize(new Dimension(450, 50));
        panel1.setBackground(Color.red);


        panel2 = new JPanel();
        panel2.setName("Panel for labels");
        panel1.add(panel2);
        panel2.setLayout(new GridLayout(1, 2, 50, 0));
        panel2.setBorder(BorderFactory.createEmptyBorder(0, 30, 0, 20));
        panel2.setBackground(Color.red);

        panel3 = new JPanel();
        panel3.setName("Panel for textarea");
        frame1.add(panel3);
        panel3.setPreferredSize(new Dimension(450, 100));
        panel3.setBackground(Color.red);

        panel4 = new JPanel();
        panel4.setName("Panel for buttons");
        frame1.add(panel4);
        panel4.setLayout(new GridLayout(2, 1, 10, 8));
        panel4.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel4.setBackground(Color.red);
    }

    private void createFrame() {
        frame1 = new JFrame("ToDo List");
//        BorderLayout myLayout = new BorderLayout();
        frame1.setLayout(new GridLayout(3,1,2,2));
        frame1.setPreferredSize(new Dimension(600, 500));
        frame1.pack();
        frame1.setLocationRelativeTo(null);
        frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void display() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frame1.setVisible(true);
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == load) {
            printToArea(tasks.getList());
        } else if (e.getSource() == inputField) {
            listingArea.setText(null);
            tasks.add(inputField.getText());
            inputField.setText("");
            printToArea(tasks.getList());
        } else if (e.getSource() == add) {
            listingArea.setText(null);
            tasks.add(inputField.getText());
            inputField.setText("");
            printToArea(tasks.getList());
        } else if (e.getSource() == remove) {
            listingArea.setText(null);
            int y = Integer.parseInt(inputField.getText());
            try {
                tasks.remove(y);
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            inputField.setText("");
            printToArea(tasks.getList());
        } else if (e.getSource() == complete) {
            listingArea.setText(null);
            int z = Integer.parseInt(inputField.getText());
            tasks.complete(z);
            inputField.setText("");
            printToArea(tasks.getList());
        } else if (e.getSource() == save) {
            try {
                tasks.writeListToSQL();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } else if (e.getSource() == removeAll) {
            listingArea.setText("");
            try {
                tasks.removeAll();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
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
