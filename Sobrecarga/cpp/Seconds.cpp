#include "Seconds.h"

Seconds::Seconds(int m){
    min = m;
    hrs = 0;
    dia = 0;
    seg = 0.0;
}

Seconds::Seconds(int h, int m){
    min = m;
    hrs = h;
    dia = 0;
    seg = 0.0;
}

Seconds::Seconds(int d, int h, int m){
    min = m;
    hrs = h;
    dia = d;
    seg = 0.0;
}

Seconds::~Seconds(){};

void Seconds::convert(){
    seg = min*60;
    seg += hrs*3600;
    seg += dia*3600*24;
}