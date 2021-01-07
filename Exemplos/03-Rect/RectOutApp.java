public class RectOutApp {
    public static void main (String[] args) {
        Rect r1 = new Rect(1,1, 10,10);
        r1.print();

        r1.x = 20;
        r1.print();
        print(r1);
    }

    static void print (Rect r) {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            r.w, r.h, r.x, r.y);
    }
}

class Rect {
    int x, y;
    int w, h;

    Rect (int xx, int yy, int ww, int hh) {
        this.x = xx;
        this.y = yy;
        this.w = ww;
        this.h = hh;
    }

    void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }
}
