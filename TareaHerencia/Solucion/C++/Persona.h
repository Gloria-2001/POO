#include <stdio.h>
#include <stdlib.h>
#include <string>
#include <iostream>
using namespace std;

#ifndef _PERSONA_H_
#define _PERSONA_H_

class Persona{
    private:
        string nombre;
        int edad;
    public:
        Persona(string,int);
        string darNombre();
        int darEdad();
};

#endif