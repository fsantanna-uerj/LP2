import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

class ListApp {
    public static void main (String[] args) {
        ListFrame frame = new ListFrame();
        frame.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        frame.setVisible(true);
    }
}

class ListFrame extends JFrame {
    ArrayList<Rect> rs = new ArrayList<Rect>();

    ListFrame () {
        this.setTitle("Lista de Retangulos");
        this.setSize(350, 350);

        rs.add(new Rect( 50, 50, 100, 30));
        rs.add(new Rect( 50,200,  10, 20));
        rs.add(new Rect(200, 50,  50, 50));
        rs.add(new Rect(200,200,  50,100));
    }

    public void paint (Graphics g) {
        super.paint(g);
        for (Rect r: this.rs) {
            r.paint(g);
        }
    }
}

class Rect {
    int x, y;
    int w, h;

    Rect (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(this.x,this.y, this.w,this.h);
    }
}
