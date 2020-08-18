#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <string>
#include "Persona.h"
using namespace std;

class Villano : public Persona{
    public:
        string nickname;
        string superpoder;
        Villano(string,string,string,int);
        void presentacion();
        string revelarNombre();
};