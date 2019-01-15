package twentyfortyeight;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public final class Grid extends JPanel {

    Grid() {

        update();
    }

    public void update() {

        this.repaint();
    }

    @Override

    public void paintComponent(Graphics g) {

        g.setColor(Color.BLACK);
        g.drawRect(160, 160, 320, 320);
        g.drawLine(220, 160, 220, 400);
        g.drawLine(280, 160, 280, 400);
        g.drawLine(340, 160, 340, 400);
        g.drawLine(400, 160, 400, 400);
        g.drawLine(160, 220, 400, 220);
        g.drawLine(160, 280, 400, 280);
        g.drawLine(160, 340, 400, 340);
        g.drawLine(160, 400, 400, 400);


    }

}