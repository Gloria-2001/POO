#include <string>
#include "Persona.h"
#include "Superheroe.h"

Superheroe::Superheroe(string nickname,string superpoder,string nombre,int edad) : Persona(nombre,edad){
    this->nickname=nickname;
    this->superpoder=superpoder;
}

void Superheroe::presentacion(){
    cout<<"Soy "<<nickname<<" y mi poder es "<<superpoder<<endl;
}

void Superheroe::revelarNombre(){
    cout<<"Mi nombre es "<<darNombre()<<endl;
}