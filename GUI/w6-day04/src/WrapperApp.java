import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ${SzilviaB} on 2016. 11. 24..
 */
public class WrapperApp extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu filemenu;
    JMenuItem menuItem;
    JPanel controlpanel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WrapperApp();
            }
        });

    }

    public WrapperApp (){
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        controlpanel = new JPanel();
        this.add(new ImagePanel());
        this.setJMenuBar(menubar());

    }

    public JMenuBar menubar(){
        menuBar = new JMenuBar();

        filemenu = new JMenu("File");
        menuBar.add(filemenu);
        menuItem = new JMenuItem("Exit");
        filemenu.add(menuItem);
        menuItem.addActionListener(this);

        JMenu imagepan = new JMenu("Image");
        menuBar.add(imagepan);
        JMenuItem imagepanel = new JMenuItem("Image source");
        imagepan.add(new ImagePanel());


        JMenu eventcount = new JMenu("EventCounter");
        menuBar.add(eventcount);




        return menuBar;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
