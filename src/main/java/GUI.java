import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class GUI extends JFrame {

    private final JPanel panel = new JPanel();

    private final JButton changeKey = new JButton("Change your toggle key!");

    private KeyEvent key;

    public GUI() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 500);
        this.setLayout(null);

        this.panel.setSize(this.getSize());
        this.panel.setLayout(null);
        this.panel.setBackground(Color.GRAY);

        this.changeKey.addActionListener(event -> {
            new KeyGUI().onKeyPressed(key_event -> {
                this.key = key_event;
            });
        });

        this.changeKey.setBounds(60, 25, 170, 45);

        this.panel.add(this.changeKey);

        this.add(panel);

        this.setLocationRelativeTo(null);

        this.setIconImage(new ImageIcon("./src/main/java/icon.png").getImage());
        this.setVisible(true);
    }

}
