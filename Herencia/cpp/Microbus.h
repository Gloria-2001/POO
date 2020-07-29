#include <stdio.h>
#include <stdlib.h>
#include <string>
#include <iostream>
#include "Vehiculo.h"
using namespace std;

#ifndef _MICROBUS_H_
#define _MICROBUS_H_

class Microbus : public Vehiculo{
    public:
        bool timbre;
        Microbus();
        void sonar();
        void gritar();
        void tocarTimbre();
};

#endif