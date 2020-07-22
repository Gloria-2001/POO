#include <stdio.h>
#include <stdlib.h>
#include <string>
#include <iostream>
using namespace std;

#ifndef _PERSONA_H_
#define _PERSONA_H_

class Persona{
    public:
        string nombre;
        string apellidos;
        int edad;
        Persona(string, string, int); // Contructor
        ~Persona();                                 // Destructor
        void caminar();
        void dormir();
        void hablar();
};

#endif