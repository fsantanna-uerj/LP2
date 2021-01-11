package figures;

import java.awt.Graphics;

public abstract class Figure {
    public int x, y;
    public int w, h;

    public Figure (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public void drag (int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public abstract void paint (Graphics g);
}
