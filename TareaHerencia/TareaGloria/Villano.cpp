#include <string>
#include "Persona.h"
#include "Villano.h"

Villano::Villano(string nickname, string superpoder,string nombre,int edad) : Persona(nombre,edad){
    this->nickname=nickname;
    this->superpoder=superpoder;
}

void Villano::presentacion(){
    cout<<"Soy "<<nickname<<" y mi poder es "<<superpoder<<endl;
}

string Villano::revelarNombre(){
    cout<<"Mi nombre es "<<darNombre()<<endl;
}