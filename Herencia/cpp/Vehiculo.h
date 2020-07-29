#include <stdio.h>
#include <stdlib.h>
#include <string>
#include <iostream>
using namespace std;

#ifndef _VEHICULO_H_
#define _VEHICULO_H_

class Vehiculo{
    public:
        int llantas;
        bool estado;
        int puertas;
        string asientos;
        float largo;
        Vehiculo();
        void encender();
        void apagar();
        bool getEstado();
        void sonar();
};

#endif