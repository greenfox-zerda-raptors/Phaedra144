import javax.swing.*;
import java.awt.*;

/**
 * Created by ${SzilviaB} on 2016. 11. 23..
 */
public class HelloWorld extends JFrame {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HelloWorld();
            }
        });


    }

    public HelloWorld(){


        this.setTitle("This is myfirst Hello World JFrame");

        this.setVisible(true);
        this.setSize(400, 400);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel thePanel = new JPanel();

        this.add(thePanel);

        JLabel label1 = new JLabel("Hello World!");
        thePanel.add(label1);

        label1.setText("Hello Szilvi!");

        String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

        String stringHolder = "";
        for (int i = 0; i < hellos.length; i++){
            stringHolder += hellos[i] + ", ";
            label1.setText(stringHolder);
        }

        Toolkit tk = Toolkit.getDefaultToolkit();

        Dimension dim = tk.getScreenSize();

        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);

        this.setLocation(xPos, yPos);
        this.setResizable(true);







    }
}
