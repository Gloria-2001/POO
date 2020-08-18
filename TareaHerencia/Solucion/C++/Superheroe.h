#include <stdio.h>
#include <stdlib.h>
#include <string>
#include <iostream>
#include "Persona.h"
using namespace std;

#ifndef _SUPERHEROE_H_
#define _SUPERHEROE_H_

class Superheroe : public Persona{
    private:
        string nickname;
        string super_poder;
    public:
        Superheroe(string,int,string,string);
        void presentacion();
        void revelarNombre();
};

#endif