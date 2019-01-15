package twentyfortyeight;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class scoreBoard extends JPanel {
    Matrix matrix;
    public boolean showGameOver = false;
    public boolean showGameWon = false;

    scoreBoard(Matrix mat) {

        matrix = mat;
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.LIGHT_GRAY);
        g.fillRoundRect(170, 10, 115, 60, 15, 15);
        g.setFont(new Font("Arial", Font.PLAIN, 48));
        g.setColor(Color.DARK_GRAY);
        g.drawString("2048", 175, 57);
        g.setColor(Color.black);
        g.fillRoundRect(10, 200, 140, 90, 15, 15);
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.setColor(Color.WHITE);
        g.drawString("SCORE: ", 15, 230);
        g.drawString(matrix.getScore(), 15, 270);
        if (showGameOver) {
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 66));
            g.drawString("GAME OVER", 5, 135);
        }
        if (showGameWon) {
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 66));
            g.drawString("YOU WON!!", 5, 135);

        }

    }

    public void Update() {
        repaint();
    }
}
