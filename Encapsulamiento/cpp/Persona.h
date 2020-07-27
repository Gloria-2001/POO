#include <stdio.h>
#include <stdlib.h>
#include <string>
#include <iostream>
using namespace std;

#ifndef _PERSONA_H_
#define _PERSONA_H_

class Persona{
    private:
        char curp[17];
    public:
        string nombre;
        string apellidos;
        int edad;
        Persona(string, string, int, string); // Contructor
        ~Persona();                                 // Destructor
        void caminar();
        void dormir();
        void hablar();
        char* getCURP();    // getter
        void setCURP(string); // setter
};

#endif