#include "Superheroe.h"

Superheroe::Superheroe(string name, int age, string nick, string power) : Persona(name,age){
    nickname = nick;
    super_poder = power;
}

void Superheroe::presentacion(){
    cout<<"Hola soy "<<nickname<<" y mi poder es "<<super_poder<<endl;
}

void Superheroe::revelarNombre(){
    cout<<"Mi verdadero nombre es "<<darNombre()<<endl;
}