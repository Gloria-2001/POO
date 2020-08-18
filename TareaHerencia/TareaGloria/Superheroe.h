#include <stdio.h>
#include <stdlib.h>
#include <string>
#include <iostream>
#include "Persona.h"
using namespace std;

class Superheroe : public Persona{
    public:
        string nickname;    
        string superpoder;
        Superheroe(string,string,string,int);
        void presentacion();
        void revelarNombre();
};

