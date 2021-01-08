import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import figures.*;

class PackApp {
    public static void main (String[] args) {
        PackFrame frame = new PackFrame();
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

class PackFrame extends JFrame {
    Rect r1;
    Ellipse e1;

    PackFrame () {
        this.setTitle("Java Packages");
        this.setSize(350, 350);

        this.r1 = new Rect(50,50, 100,30);
        this.e1 = new Ellipse(50,100, 100,30);
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.r1.paint(g);
        this.e1.paint(g);
    }
}
