#include "Persona.h"
#include "string.h"

Persona::Persona(string name, string last, int age,string cc){
    nombre = name;
    apellidos = last;
    edad = age;
    strcpy(curp,cc.c_str());
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

char* Persona::getCURP(){
    return curp;
}

void Persona::setCURP(string cc){
    strcpy(curp,cc.c_str());
}