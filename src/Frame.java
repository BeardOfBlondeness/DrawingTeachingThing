import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() {
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setContentPane(new JLayeredPane());
        getContentPane().setBackground(Color.BLACK);
        addCanvas();
    }

    private void addCanvas() {
        JLabel drawCanvas = new JLabel();
        drawCanvas.setBounds(20, 20, 500, 580);
        drawCanvas.setLocation(20, 20);
        drawCanvas.setBackground(Color.WHITE);
        drawCanvas.setOpaque(true);
        add(drawCanvas);
    }
}