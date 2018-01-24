import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() {
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setContentPane(new JLayeredPane());
        addBackground();
        addCanvas();
    }

    private void addBackground() {
        JLabel bg = new JLabel();
        bg.setBackground(Color.BLACK);
        bg.setBounds(0, 0, getWidth(), getHeight());
        bg.setOpaque(true);
        getContentPane().add(bg, new Integer(0));
    }
    private void addCanvas() {
        JLabel drawCanvas = new JLabel();
        drawCanvas.setBounds(20, 20, 500, 520);
        drawCanvas.setLocation(20, 20);
        drawCanvas.setBackground(Color.WHITE);
        drawCanvas.setOpaque(true);
        getContentPane().add(drawCanvas, new Integer(1));
    }
}