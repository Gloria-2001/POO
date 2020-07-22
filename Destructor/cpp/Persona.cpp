#include "Persona.h"

Persona::Persona(string name, string last, int age){
    nombre = name;
    apellidos = last;
    edad = age;
}

Persona::~Persona(){
    cout<<"Me mori Dx"<<endl;
}

void Persona::caminar(){
    cout<<"Estoy caminando"<<endl;
}

void Persona::dormir(){
    cout<<"zzz"<<endl;
}

void Persona::hablar(){
    cout<<"Hola, soy "<<nombre<<endl;
}