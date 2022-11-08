import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyGUI extends JFrame implements KeyListener {

    public KeyGUI() {

        this.setSize(400, 200);
        JLabel label = new JLabel("Press a key!");
        label.setBounds(this.getWidth() / 2 - 300 / 2, this.getHeight() / 2, 300, 100);
        this.add(label);

        this.setLocationRelativeTo(null);
    }

    private IKeyPressed keyPressed;

    public void onKeyPressed(IKeyPressed keyPressed) {
        this.keyPressed = keyPressed;
        this.setVisible(false);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if(this.keyPressed != null)
            this.keyPressed.on(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {}
}
