#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <string>
using namespace std;

#ifndef _PERSONA_H_
#define _PERSONA_H_

class Persona{
    protected:
        string nombre;
        int edad;
    public:
         Persona(string,int);
         string darNombre();     
};

#endif