import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ${SzilviaB} on 2016. 11. 24..
 */
public class Event_counter extends JFrame implements KeyListener, MouseListener, WindowListener {

    private JLabel mouseLabel, keyLabel, windowsLabel;
    private JTextField textField;
    private int keyClicks;
    private int mouseClicks;
    private int windowClicks;


    public Event_counter() {
        counting();
        this.setTitle("My first counter");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setSize(400, 200);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void counting() {
        JPanel panel = new JPanel();
        this.add(panel);
        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);
        panel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

        textField = new JTextField(15);
        panel.add(textField);

        keyLabel = new JLabel("Key entered: ");
        panel.add(keyLabel);
        textField.addKeyListener((KeyListener) this);

        mouseLabel = new JLabel("Mouse clicked: ");
        panel.add(mouseLabel);
        this.addMouseListener((MouseListener) this);

        windowsLabel = new JLabel("Window state: ");
        panel.add(windowsLabel);
        this.addWindowListener((WindowListener) this);

        windowsLabel = new JLabel("Action of window: ");
        panel.add(windowsLabel);
        this.addWindowListener((WindowListener) this);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Event_counter();
            }
        });
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        textField.setText("Key pressed: " + "\n");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        textField.setText("Key released: " + e.getKeyChar() + "\n");
        keyClicks++;
        keyLabel.setText("Key entered: " + keyClicks);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        mouseClicks++;
        mouseLabel.setText("Mouse clicked: " + mouseClicks);
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

    @Override
    public void windowOpened(WindowEvent e) {
        windowsLabel.setText("Action of window: " + windowClicks);
    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {
        windowClicks++;
        windowsLabel.setText("Action of window: " + windowClicks);
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        windowClicks++;
        windowsLabel.setText("Action of window: " + windowClicks);
    }

    @Override
    public void windowActivated(WindowEvent e) {
        windowClicks++;
        windowsLabel.setText("Action of window: " + windowClicks);
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        windowClicks++;
        windowsLabel.setText("Action of window: " + windowClicks);
    }
}



