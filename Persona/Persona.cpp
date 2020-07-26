#include <iostream>
#include <string>
using namespace std;

class Persona { 
    public:
        string nombre;
        string apellidos; 
        int edad;
        char sexo;
        float peso;

        Persona(string,string,int,char,float);

        void caminar();
        void dormir();
        void hablar();
};

Persona::Persona(string nombre,string apellidos,int edad,char sexo,float peso){
    this->nombre=nombre;
    this->apellidos=apellidos;
    this->edad=edad;
    this->sexo=sexo;
    this->peso=peso;
}

void Persona::hablar(){
     cout <<"Hola, yo soy "<<this->nombre<<endl;
} 

void Persona::dormir(){
     cout <<"zzz"<<endl;
}

void Persona::caminar(){
    cout <<"Estoy caminando"<<endl;
}

int main(){
    Persona p00("Gloria","Olivares",18,'f',61);
    p00.hablar();
    p00.caminar();
    p00.dormir();
}