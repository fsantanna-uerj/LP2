#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int r,g,b;
} Color;

struct Figure;
typedef void (* Figure_Draw) (struct Figure*);

typedef struct Figure {
    int x,y, h,w;
    Color fg, bg;
    Figure_Draw draw;
} Figure;

///////////////////////////////////////////////////////////////////////////////

typedef struct {
    Figure super;
} Rect;

void rect_draw (Rect* this) {
    Figure* super = (Figure*) this;
    printf("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
           super->w, super->h, super->x, super->y);
}

Rect* rect_new (int x, int y, int w, int h) {
    Rect*   this  = malloc(sizeof(Rect));
    Figure* super = (Figure*) this;
    super->draw = (Figure_Draw) rect_draw;
    super->x = x;
    super->y = y;
    super->w = w;
    super->h = h;
}

///////////////////////////////////////////////////////////////////////////////

typedef struct {
    Figure super;
} Ellipse;

void Ellipse_draw (Ellipse* this) {
    Figure* super = (Figure*) this;
    printf("Elipse de tamanho (%d,%d) na posicao (%d,%d).\n",
           super->w, super->h, super->x, super->y);
}

Ellipse* ellipse_new (int x, int y, int w, int h) {
    Ellipse* this = malloc(sizeof(Ellipse));
    Figure* super = (Figure*) this;
    super->draw = (Figure_Draw) Ellipse_draw;
    super->x = x;
    super->y = y;
    super->w = w;
    super->h = h;
}

///////////////////////////////////////////////////////////////////////////////

void main (void) {
    Figure* figs[4] = {
        (Figure*) rect_new(10,10,100,100),
        (Figure*) ellipse_new(40,10,140,300),
        (Figure*) rect_new(10,10,100,100),
        (Figure*) ellipse_new(210,110,305,130)
    };

    ///

    for (int i=0; i<4; i++) {
        figs[i]->draw(figs[i]);
    }

    ///

    for (int i=0; i<4; i++) {
        free(figs[i]);
    }
}
