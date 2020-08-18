#include "Persona.h"

Persona::Persona(string name, int age){
    nombre = name;
    edad = age;
}

string Persona::darNombre(){
    return nombre;
}

int Persona::darEdad(){
    return edad;
}