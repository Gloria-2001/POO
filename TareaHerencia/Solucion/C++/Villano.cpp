#include "Villano.h"

Villano::Villano(string name, int age, string nick, string power) : Persona(name,age){
    nickname = nick;
    super_poder = power;
}

void Villano::presentacion(){
    cout<<"Hola soy "<<nickname<<" y mi poder es "<<super_poder<<endl;
}

void Villano::revelarNombre(){
    cout<<"Mi verdadero nombre es "<<darNombre()<<endl;
}