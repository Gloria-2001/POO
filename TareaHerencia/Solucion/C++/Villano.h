#include <stdio.h>
#include <stdlib.h>
#include <string>
#include <iostream>
#include "Persona.h"
using namespace std;

#ifndef _VILLANO_H_
#define _VILLANO_H_

class Villano : public Persona{
    private:
        string nickname;
        string super_poder;
    public:
        Villano(string,int,string,string);
        void presentacion();
        void revelarNombre();
};

#endif