package figures;

import java.awt.*;

public class Rect extends Figure {
    public Rect (int x, int y, int w, int h) {
        super(x,y, w,h);
    }

    public void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics g, boolean focused) {
        Graphics2D g2d = (Graphics2D) g;

        if (focused) {
            g2d.setPaint(Color.RED);
            g2d.fillRect(this.x-2,this.y-2, this.w+4,this.h+4);
        }

        g2d.setPaint(Color.BLACK);
        g2d.fillRect(this.x,this.y, this.w,this.h);
    }
}
