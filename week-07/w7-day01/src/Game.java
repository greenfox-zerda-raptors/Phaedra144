import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by ${SzilviaB} on 2016. 12. 05..
 */
public class Game extends JFrame  {


    public Game() {

        this.setResizable(true);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new Board());
        this.pack();
        this.setLocationRelativeTo(null);


    }


    public void createGame() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }



}
