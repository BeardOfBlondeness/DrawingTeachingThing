import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Frame extends JFrame {

    public Frame() {
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setContentPane(new JLayeredPane());
        addBackground();
        addCanvas();
        addToolBar();
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
        drawCanvas.setBounds(20, 20, 600, 520);
        drawCanvas.setLocation(20, 20);
        drawCanvas.setBackground(Color.WHITE);
        drawCanvas.setOpaque(true);
        getContentPane().add(drawCanvas, new Integer(1));
    }

    private void addToolBar() {
        Color colors[] = {Color.BLACK, Color.WHITE, Color.RED, Color.BLUE, Color.YELLOW, Color.GREEN, Color.PINK, Color.CYAN, Color.MAGENTA, Color.ORANGE};
        final int beginX = 700, beginY = 20;
        int colorIndex = 0;
        for(int y = 0; y < 5; y++) {
            for(int x = 0; x < 2; x++) {
                JLabel Chooser = new JLabel();
                Chooser.setBounds(beginX + (x*100), beginY + (y*100), 80, 80);
                Chooser.setBackground(colors[colorIndex]);
                Chooser.setOpaque(true);
                Chooser.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        System.out.println("e = [" + e + "]");
                    }
                });
                getContentPane().add(Chooser, new Integer(1));
                colorIndex++;
            }
        }
    }
}