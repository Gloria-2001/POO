#include "Persona.h"


Persona::Persona(string nombre, int edad){
    this->nombre=nombre;
    this->edad=edad;
}

string Persona::darNombre(){
    return nombre;
}
